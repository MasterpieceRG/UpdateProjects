import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var year = scan.nextInt()
    if(year in 1000..9000) {
        var nextYear = year +1
        while (!distinct(nextYear)) {
            nextYear++
        }
        println("$nextYear")
    }

}

fun distinct(year: Int): Boolean {
    val digits = year.toString().toCharArray()
    for (i in 0..2) {
        for (j in i + 1 until digits.size) {
            if (digits[i] == digits[j]) {
                return false
            }
        }
    }
    return true
}