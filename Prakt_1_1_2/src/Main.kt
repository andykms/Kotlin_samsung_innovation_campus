fun main() {
    /*ДНК состоит из 4 типов нуклеотидов: A (аденин), T (тимин), G (гуанин), C (цитозин).

Ваша программа получает на вход строку вида ATGCCTCTCTC и должна
посчитать число нуклеотидов каждого типа
(вывести числа через пробел в порядке как в строке выше).*/
    val input:String = readln()
    val results:IntArray = intArrayOf(0,0,0,0)
    for(i in input) {
        when(i) {
            'A'-> results[0]++
            'T' -> results[1]++
            'G' ->results[2]++
            'C'-> results[3]++
        }
    }
    println("${results[0]} ${results[1]} ${results[2]} ${results[3]}")
}