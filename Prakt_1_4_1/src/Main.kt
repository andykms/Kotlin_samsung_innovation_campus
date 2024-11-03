/*Необходимо разработать класс для управления роботом (Robot),
    содержащий поля
    координат x, y (тип Int) и направления direction.
    Для направления уже определён заранее тип Direction:

    enum class Direction {
        UP, DOWN, RIGHT, LEFT
    }
    Обратите внимание, что мы используем
    тип enum для указания направления.
    Для управления роботом определите методы turnLeft(),
    turnRight(), stepForward().
    Конструктор получает параметры (x, y, direction).
    Предусмотрите вывод состояния робота методом toString() в виде

    x: $x, y: $y, dir: $direction*/


/*Используя класс для управления роботом (Robot), разработанный в предыдущем задании, реализуйте функцию
moveRobot(r: Robot, toX: Int, toY: Int), перемещающую объект типа Robot
с помощью методов turnLeft(), turnRight(), stepForward() в заданную точку (toX, toY).
В качестве решения сообщите только код функции moveRobot, классы Direction и Robot уже определены.*/

fun moveRobot(r: Robot, toX: Int, toY: Int) {
    var start_x: Int = r.x
    var start_y: Int = r.y
    var end_x:Int = toX
    var end_y:Int = toY
    if(start_x <= end_x) {
        if(start_y <= end_y){
            when(r.direction){
                Direction.UP -> {r.turnRight(); }
                Direction.DOWN -> {r.turnLeft(); }
                Direction.LEFT -> {
                    r.turnRight()
                    r.turnRight()
                }
                Direction.RIGHT -> Direction.RIGHT
            }
            if (r.x!= end_x){
                r.stepForward()
            }
            if (r.y!= end_y) {
                r.turnLeft()
                r.stepForward()
            }
            if(r.x == end_x && r.y == end_y){
                println("Робот прибыл в место назначения! ")
            }
            else{
                println(r.toString())
                moveRobot(r, toX, toY)
            }
        }
        else{
            when(r.direction){
                Direction.UP -> {r.turnRight(); }
                Direction.DOWN -> {r.turnLeft(); }
                Direction.LEFT -> {
                    r.turnRight()
                    r.turnRight()
                }
                Direction.RIGHT -> Direction.RIGHT
            }
            if (r.x!= end_x){
                r.stepForward()
            }
            if (r.y!= end_y) {
                r.turnRight()
                r.stepForward()
            }
            if(r.x == end_x && r.y == end_y){
                println("Робот прибыл в место назначения!")
            }
            else{
                println(r.toString())
                moveRobot(r, toX, toY)
            }
        }
    }



    else{
        if(start_y <= end_y){
            when(r.direction){
                Direction.UP -> {r.turnLeft(); }
                Direction.DOWN -> {r.turnRight(); }
                Direction.LEFT -> {Direction.LEFT}
                Direction.RIGHT -> {
                    r.turnLeft()
                    r.turnLeft()
                }
            }
            if (r.x!= end_x){
                r.stepForward()
            }
            if (r.y!= end_y) {
                r.turnRight()
                r.stepForward()
            }
            if(r.x == end_x && r.y == end_y){
                println("Робот прибыл в место назначения! ")
            }
            else{
                println(r.toString())
                moveRobot(r, toX, toY)
            }
        }
        else{
            when(r.direction){
                Direction.UP -> {r.turnLeft(); }
                Direction.DOWN -> {r.turnRight(); }
                Direction.LEFT -> {Direction.LEFT}
                Direction.RIGHT -> {
                    r.turnLeft()
                    r.turnLeft()
                }
            }
            if (r.x!= end_x){
                r.stepForward()
            }
            if (r.y!= end_y) {
                r.turnLeft()
                r.stepForward()
            }
            if(r.x == end_x && r.y == end_y){
                println("Робот прибыл в место назначения!")
            }
            else{
                println(r.toString())
                moveRobot(r, toX, toY)
            }
        }
    }

}

enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

class Robot constructor(var x: Int,var y: Int,var direction: Direction){
    fun turnLeft() {
        this.direction = when(this.direction) {
            Direction.UP -> Direction.LEFT
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
            Direction.LEFT -> Direction.DOWN
        }
    }


    fun turnRight() {
        this.direction = when(this.direction) {
            Direction.UP -> Direction.RIGHT
            Direction.DOWN -> Direction.LEFT
            Direction.RIGHT -> Direction.DOWN
            Direction.LEFT -> Direction.UP
        }
    }


    fun stepForward() {
        when(this.direction) {
            Direction.UP -> this.y+=1
            Direction.DOWN -> this.y-=1
            Direction.RIGHT -> this.x+=1
            Direction.LEFT -> this.x-=1
        }
    }

    override fun toString(): String {
        return ( "x: ${this.x}, y: ${this.y}, dir: ${this.direction.name}")
    }
}

fun main() {
    /*Необходимо разработать класс для управления роботом (Robot),
    содержащий поля
    координат x, y (тип Int) и направления direction.
    Для направления уже определён заранее тип Direction:

    enum class Direction {
        UP, DOWN, RIGHT, LEFT
    }
    Обратите внимание, что мы используем
    тип enum для указания направления.
    Для управления роботом определите методы turnLeft(),
    turnRight(), stepForward().
    Конструктор получает параметры (x, y, direction).
    Предусмотрите вывод состояния робота методом toString() в виде

    x: $x, y: $y, dir: $direction*/
    val r1: Robot =Robot(-3, -1, Direction.RIGHT)
    moveRobot(r1, -7, -1)
}