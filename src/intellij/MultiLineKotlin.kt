package intellij


class MultiLineKotlin {
    fun main(args: Array<String>) {
        val text = "이런" +
                " 일" +
                "이 생기" +
                "지는 " +
                "않" +
                "겠지만 해당 " +
                "기능" +
                "을 설명 " +
                "하" +
                "기 " +
                "좋은 " +
                "예시" +
                "라고 " +
                "생각" +
                "했어요" +
                "."
        Example(
                "control + shift + j, to join String",
                "제대로 동작하지 않아요 ${MultiLineJava()} 참고"
        )
    }
}