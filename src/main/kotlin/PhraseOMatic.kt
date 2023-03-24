import kotlin.random.Random
import kotlin.random.nextInt

fun phraseOMatic(){
     val firstListOfWords = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
     val secondListOfWords = arrayOf("empowered", "leveraged", "aligned", "targeted")
     val thirdListOfWords = arrayOf("process", "paradigm", "solution", "portal", "vision")

//    thirdListOfWords[2] = "Second list object"


     val rand = Random.nextInt(0,10)
     val ran1:Int = Random.nextInt(0, firstListOfWords.size)
     val ran2 = Random.nextInt(0, secondListOfWords.size)
     val ran3 = Random.nextInt(0, thirdListOfWords.size)

     val phrase = "${firstListOfWords[ran1]} ${secondListOfWords[ran2]} ${thirdListOfWords[ran3]} $rand"

     println(phrase)
 }