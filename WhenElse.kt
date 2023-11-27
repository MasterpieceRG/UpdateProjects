fun main(args: Array<String>) {
    var a = 10
    var b = 20

    var operator = readLine()

    var result = when(operator) {
        "+" -> a+b
        "-" -> a-b
        "*" -> a*b
        "/" -> a/b
        else -> println("Please input a valid operator")
    }
    println("a ${operator} b = ${result}")
}