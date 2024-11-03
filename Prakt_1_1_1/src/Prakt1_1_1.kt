


fun main() {
    /*
    Пр 1.1 задание 1
    Дана комната со сторонами a и b и ковер со сторонами m и n.
    Определить помещается ли ковер в комнату (ковер можно поворачивать, но нельзя складывать).
    На вход программе подается четыре вещественных числа, разделенных пробелом: a, b, m и n.
    На выходе необходимо напечатать "YES", если ковер помещается в комнату и "NO" в противном случае.
    */

    println("Hello World!")
    val input:List<String> = readln().split(" ")
    val input_int:FloatArray = floatArrayOf(input[0].toFloat(),
    input[1].toFloat(),
    input[2].toFloat(),
    input[3].toFloat());
    if((input_int[0] + input_int[1]) >= (input_int[2] + input_int[3])) {
        println("YES")
    }
    else {
        println("NO")
    }

}