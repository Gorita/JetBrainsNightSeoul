package kotlintip

fun main(args: Array<String>) {
    val numbers = 1..100
    numbers.filter { it < 90 }.map { it * 100 }.sortedBy { it }

}



