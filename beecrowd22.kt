import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var A = scan.nextInt()
    var B = scan.nextInt()
    var C = scan.nextInt()
    var D = scan.nextInt()
    var sumCD = C+D
    var sumAB = A+B

    if(B>C && D>A && sumCD>sumAB && C>=0 && D>=0 && A%2==0) {
        println("Valores aceitos")
    }else{
        println("Valores nao aceitos")
    }
}