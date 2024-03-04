package id.ac.pnm.ti2a.aplikasikotlin1

import android.graphics.Color
class Sepeda(var pages: Int, var color: String = "Blue") {
    var sepedaOfColor: String = color
    val numberOfPages: Int = pages
    var isForSale: Boolean = false

    fun updateColor(newColor: String) {
        this.sepedaOfColor = newColor
    }

    fun putOnSale(status: Boolean) {
        this.isForSale = status
    }
}

fun main() {
    val sepeda = Sepeda(pages = 2, color="blue")
    println("Sepeda 1 berwarna ${sepeda.sepedaOfColor}")
    println("Sepeda 1 memiliki ${sepeda.numberOfPages} buah" )
    sepeda.updateColor("Red")
    println("Sepeda 1 setelah diupdate menjadi warna ${sepeda.sepedaOfColor}")

}