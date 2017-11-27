package intellij


class JSONSample {
    fun main(args: Array<String>) {
        val myJson = "{\n  \"question\": \"Favourite programming language?\",\n  \"published_at\": \"2015-08-05T08:40:51.620Z\",\n  \"choices\": [\n    {\n      \"choice\": \"Swift\",\n      \"votes\": 0\n    }, {\n      \"choice\": \"Python\",\n      \"votes\": 0\n    }, {\n      \"choice\": \"Objective-C\",\n      \"votes\": 0\n    }, {\n      \"choice\": \"Ruby\",\n      \"votes\": 0\n    }\n  ]\n}"
        Example(
                "alt + enter, inject language > JSON 클릭",
                "alt + enter, Edit JSON fragment 를 통해서 쉽게 편집 가능"
        )
    }
}


class RegexSample {
    fun main(args: Array<String>) {
        val myRegexp = "Yes|No"
        Example(
                "alt + enter, inject language > Regexp 클릭",
                "alt + enter, Check RegExp 통해 체크 가능"
        )
    }
}
