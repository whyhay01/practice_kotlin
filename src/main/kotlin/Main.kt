fun main(args: Array<String>) {

//    updatedFunc()
//    phraseOMatic()
//    chapter2CodeMagnet()
//    println(superiorForce())

    val noOfReccePeanutCup = readln().toInt()
    val isWeekend = readln().toBoolean()

    println(noOfReccePeanutCup in if (isWeekend) 15..25 else 10..20)

    // token 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

}


fun loopy (){
    var num = 0
    println("Before loop num = $num")
    while (num < 4){
        println("In the loop num = $num")
        num += 1
    }
    println("End of loop num = $num")
}

fun updatedFunc(){
    var x = 1
    while (x < 3){
        print(if (x == 1)"Yab" else "Dab")
        print("ba")

        x = x + 1
    }
    if (x == 3) println("Do")

}
fun chapter2CodeMagnet(){
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1,3,4,2)
    var y: Int
    var x = 0

    while (x < 4){
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x += 1
    }
}

fun superiorForce():Int{
    val galatical = readln()
    val rebelAlliance = readln()

    return galatical.toInt() / rebelAlliance.toInt()

}