fun main(args: Array<String>) {
    for (i in 1..100 step 2) {
        when (i) {
            in 1..50 -> println("This is the first print and the number is ${i}!")
            in 50..100 -> println("This is the second print and the number is ${i}!")
        }
    }
}