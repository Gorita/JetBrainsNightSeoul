package intellij

/**
 * 가독성에 도움을 줄 수 있는 Font Ligature 기능에 대한 샘플 코드 입니다.
 */
fun main(args: Array<String>) {
    val a = "A"
    val b = "B"

    when {
        a == b -> println("a 와 b 는 같아요")
        a != b -> println("a 와 b 는 달라요")
        else -> {
            Example(
                    "preference > editor > font > Font(Monoid or Fira) 선택 후 'enable font ligatures' 선택",
                    "위의 when case 의 부등호를 보세요."
            )
        }
    }
}
