package id.ac.pnm.ti2a.aplikasikotlin1

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun shloudChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}


fun main () {
    println(shloudChangeWater("Sunday"))
    println(shloudChangeWater("Monday", 23))
    println(shloudChangeWater("Monday", 20, 40))
    println(shloudChangeWater("Monday", 20, 20))
}