fun main(args: Array<String>) {
    for (i in 1..100 step 2) {
        when (i) {
            in 1..50 -> Above50(i)
            in 50..100 -> Over50(i)
        }
    }
}

fun Above50(i: Int) {
    println("This is the first print and the number is ${i}!")
}

fun Over50(i: Int) {
    println("This is the second print and the number is ${i}!")
}