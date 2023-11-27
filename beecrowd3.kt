import java.text.Format
import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var r:Double = scan.nextDouble()
    var n:Double = 3.14159
    var area = n*r*r
    println("A=%.4f".format(area))
}