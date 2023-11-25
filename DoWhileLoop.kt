fun main(args: Array<String>) {
    var i:Int = 9
    var sum = 0
     do{
        print("${i} ")
        sum += i
        i--
    }while (i >= 0)
    println("\nSum of natural number: ${sum}")
}