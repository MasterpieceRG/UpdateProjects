fun main(args:Array<String>) {
    var age: Int = 18

    if (age >= 6 && age <= 16)
        println("Acess Sucess!!!")

    when (age) {
        6 -> println("admission to class 1")
        7 -> println("admission to class 2")
        8 -> println("admission to class 3")
        9 -> println("admission to class 4")
        10 -> println("admission to class 5")
        11 -> println("admission to class 6")
        12 -> println("admission to class 7")
        13 -> println("admission to class 8")
        14 -> println("admission to class 9")
        15 -> println("admission to class 10")
        16 -> println("ssc")
        else -> {
            if (age < 6)
                println("you need to growup")
            else
                println("now time to go to college")
        }
    }
}
