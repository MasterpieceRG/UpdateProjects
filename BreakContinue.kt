fun main(args: Array<String>) {
    for(i in 1..10) {
        if (i==5) {
            continue
        }
        print("${i} ")
        if (i==8) {
            break
        }
    }
}