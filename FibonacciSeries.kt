import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)

    print("Enter terms: ")
    var num = scan.nextInt()

    var first = 0
    var second = 1
    var fibo = 0

    print("${first} ${second} ")
    for (i in 3..num) {
        fibo = first + second
        first = second
        second = fibo
        print("${fibo} ")
    }

}