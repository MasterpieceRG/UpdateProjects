import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var R = scan.nextDouble()
    var pi = 3.14159

    var sphere = (4.0/3) * pi * (R * R * R)
    println("VOLUME = ${"%.3f".format(sphere)}")
}