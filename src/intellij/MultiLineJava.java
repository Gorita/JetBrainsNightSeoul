package intellij;

public class MultiLineJava {

    public static void main(String[] args) {
        String text = "이런" +
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
                ".";
        new Example(
                "control + shift + j, to join String",
                "string literals 이 제거 됨."
        );
    }
}
