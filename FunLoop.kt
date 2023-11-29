var count = 0
fun rec() {
    count++
    if(count <= 5) {
        println("Hello World " + count)
        rec()
    }
}

fun main(args: Array<String>) {
    rec()
}