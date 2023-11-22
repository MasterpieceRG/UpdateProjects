import java.util.Scanner

fun main(args: Array<String>) {
//    var name:String = readLine()!!
//    print(name)

//    var num1:Int = readLine()!!.toInt()
//    var num2:Int = readLine()!!.toInt()
//    var sum:Int = num1+num2
//    println("The sum is: ${sum}")


    var scan = Scanner(System.`in`)
    var num1:Int = scan.nextInt()
    var num2:Int = scan.nextInt()

    var add = num1 + num2
    var sub = num1 - num2
    var mul = num1 * num2
    var div:Double = num1.toDouble() / num2.toDouble()
    var mod = num1 % num2
    println("The summition is:      ${add}")
    println("The substraction is:   ${sub}")
    println("The multiplication is: ${mul}")
    println("The division is:       ${div}")
    println("The modulus is:        ${mod}")



}