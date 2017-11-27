package intellij

/**
 * @sample StructureSearchSample
 * @sample StructureSearchJavaSample
 */
fun main(args: Array<String>) {
    Example(
            """
                Edit > find > search structurally,
                if ('$'CONDITIONS'$') { '$'SINGLE_LINE'$'; }
                을 입력하고 '를 지우고 file type 을 java source 로 변경
                """,
            "검색을 하면 JavaSample 코드가 검색됨."
    )

    Example(
            """
                preference > inspections > check general
                structural search inspection > options > + 클릭
                add replace template 클릭
                Search template
                if ('$'CONDITIONS'$') {
                '$'SINGLE_LINE'$';
                } else {
                '$'ELSE'$';
                }

                Replace template
                if ('$'CONDITIONS'$')
                '$'SINGLE_LINE'$';
                else {
                '$'ELSE'$';
                }

                '를 제외하고 입력
                """,
            """
                JavaSample 코드에서 warning 으로 표시됨.
                alt + enter 자동 수정 가능
                """
    )
}
