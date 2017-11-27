package intellij


class Example(action: String, result: String = "")


class SearchSample {
    fun main(args: Array<String>) {
        /* explicitly empty */
    }
}


/**
 *  Structure search is not supported in kotlin
 */
class StructureSearchSample {
    fun main(args: Array<String>) {
        if (args.isNotEmpty()) {
            print("args size is ${args.size}")
        } else {
            print("args size is empty")
        }
    }
}
