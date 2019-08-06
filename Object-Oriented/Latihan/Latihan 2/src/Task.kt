// TODO 1
open class Vehicle(var color: String, var wheel: Int, var maxSpeed: Int)


// TODO 2
class Car: Vehicle("Red",4, 250)
class Motorcycle: Vehicle("Blue", 2, 120)

fun main() {


    // TODO 3
    with(Car()) {
        println(color)
        println(wheel)
        println(maxSpeed)
    }

    val motor = Motorcycle()
    println()

    // TODO 4
    with(motor) {
        println(color)
        println(wheel)
        println(maxSpeed)
    }
}