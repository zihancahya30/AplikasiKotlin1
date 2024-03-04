package id.ac.pnm.ti2a.aplikasikotlin1

class Circle(val radius: Double) {
    constructor(name: String) : this(5.0) {
        println("nama: $name, radius: $radius")
    }

    constructor(diameter: Int) : this(diameter / 2.0) {
        println("in diameter constructor, diameter: $diameter, radius: $radius")
    }

    init {
        println("inisialisasi lingkaran, radius: $radius")
    }

    fun area() = Math.PI * radius * radius
}

fun main() {
    val circle1 = Circle("radius")
    println("Luas lingkaran 1: ${circle1.area()}")

    val circle2 = Circle(10)
    println("Luas lingkaran 2: ${circle2.area()}")

    val circle3 = Circle(name = "radius")
    println("Luas lingkaran 3: ${circle3.area()}")
}