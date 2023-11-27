import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()
    var c = scan.nextInt()

    var r1 = a + b * c
    var r2 = a * (b + c)
    var r3 = a * b * c
    var r4 = (a + b) * c

    if(r1 > r2 && r1 > r3 && r1 > r4) {
        println(r1)
    } else if(r2 > r3 && r2 > r4 && r2 > r1) {
        println(r2)
    }else if(r3 > r4 && r3 > r1 && r3 > r2) {
        println(r3)
    }else if(r4 > r1 && r4 > r2 && r4 > r3) {
        println(r4)
    }
}