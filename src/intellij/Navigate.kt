package intellij



/**
 *  search File
 *  command + shift + O
 */
fun searchFile() {
    Example(
            "SomeThing 파일 검색하기",
            "file scope 으로 검색, class 나 symbol 은 검색 결과에서 제외된다."
    )
}

/**
 *  search class
 *  command + O
 */
fun searchClass() {
    Example(
            "SearchSample 클래스 검색해보기",
            "class scope 로 검색, file 이나 symbol 은 검색 결과에서 제외된다."
    )
}

/**
 *  search Symbol
 *  option + command + O
 */
fun searchMethod() {
    Example(
            "'main' 으로 검색해보고 'SearchSample.main' 으로 검색해보기",
            "main > 검색결과가 너무 많음, SearchSample.main > 특정 method 바로 검색됨."
    )
}

/**
 *  quick access by search
 */
fun quickAccess() {
    Example("검색창을 열고 (shift 더블클릭) '#' 입력하면 접근 가능한 setting 이 나옴",
            "토글 형식으로 setting 동작 설정 가능"
    )
}

/**
 *  add abbreviation to keymap
 */
fun addAbbreviation() {
    Example("keymap에서 'build apk' 검샘, 오른쪽 클릭 후 'add abbreviation' 클릭, 'ba'로 등록",
            "Command + shift + A 클릭 후 'ba'입력 하면 최상단에 검색됨.")
}