fun main(args: Array<String>) {
    var names = arrayOf("Sakib", "Kazi", "Fahim", "Twake", "Imran", "Gazi")
    var number = 0
    println()

    while (number < names.size) {
        println("${number}. ${names[number]}")
        number++
    }

}