fun countVowels(str: String): Int {
    var sum: Int = 0
    for(i in str){
        when(i){
            'a','e','i','o','u' -> sum++
        }
    }
    return sum
}

fun main() {
    val input:String = readln()
    println(countVowels(input))
}

