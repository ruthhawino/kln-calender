import java.time.DayOfWeek
import java.time.MonthDay
import java.util.Calendar

fun main() {


}

//Movie tickets are typically priced differently based on the age of moviegoers.
//A children's ticket price of $15 for people 12 years old or younger.
//A standard ticket price of $30 for people between 13 and 60 years old.
// On Mondays, discount the standard ticket price to $25 for this same age group.
//A senior ticket price of $20 for people 61 years old and older.
// Assume that the maximum age of a moviegoer is 100 years old.
//A  -1 value to indicate that the price is invalid when a user inputs an age outside the age specifications.
//Write a Kotlin program to calculate the age-based ticket prices.
fun ageClass(age:Int) {
    val c = Calendar.getInstance()
    val day = c.get(Calendar.DAY_OF_WEEK)
    if (day == 2) {
        when (age) {
            in 0..12 -> println("$15")
            in 13..60 -> println("$25")
            in 61..100 -> println("$20")
            else -> println(-1)
        }
    } else {
        when (age) {
            in 0..12 -> println("$15")
            in 13..60 -> println("$30")
            in 61..100 -> println("$20")
            else -> println(-1)
        }
    }
}








