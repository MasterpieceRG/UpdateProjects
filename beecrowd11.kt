import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var code1 = scan.nextInt()
    var units1 = scan.nextInt()
    var price1:Double = scan.nextDouble()
    var total1 = units1 * price1

    var code2 = scan.nextInt()
    var units2 = scan.nextInt()
    var price2:Double = scan.nextDouble()
    var total2 = units2 * price2

    var totalPrice = total1 + total2
    println("VALOR A PAGAR: R$ ${"%.2f".format(totalPrice)}")
}