import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var tk = scan.nextDouble()

    var bankNotes: Array<Double> = arrayOf(100.0, 50.0, 20.0, 10.0, 5.0, 2.0)
    var coins: Array<Double> = arrayOf(1.00, 0.50, 0.25, 0.10, 0.05, 0.01)
    var countBN: Array<Double> = arrayOf(0.0, 0.0, 0.0, 0.0, 0.0, 0.0)
    var countC:  Array<Double> = arrayOf(0.0, 0.0, 0.0, 0.0, 0.0, 0.00)

    for(i in 0 until bankNotes.size) {
        if(tk >= bankNotes[i]) {
            countBN[i] = tk / bankNotes[i]
            tk %= bankNotes[i]
        }
    }
    println("NOTAS:")
    for(i in 0 until bankNotes.size) {
        println("${countBN[i].toInt()} nota(s) de R$ ${bankNotes[i].toInt()}.00")
    }

    for(i in 0 until coins.size) {
        if(tk >= coins[i]) {
            countC[i] = tk / coins[i]
            tk %= coins[i]
        }
    }
    println("MOEDAS:")
    for(i in 0 until coins.size) {
        println("${countC[i].toInt()} moeda(s) de R$ ${"%.2f".format(coins[i])}")
    }
}