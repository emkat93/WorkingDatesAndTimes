import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.math.roundToLong

fun main() {
    var year: Int = Calendar.getInstance().get(Calendar.YEAR)  // gets the current year of the calendar
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy") // formats the pattern
    var today = LocalDate.now()  // gets today's date
    val formattedToday = today.format(formatter) // takes the today variable and formats it with the formatter variable

    println("Today's date is: $formattedToday") // prints today's date

    var lastMoonMonth = 9  // variable for the month of the last moon
    var lastMoonDay = 1 // variable for the day of the last moon

    var holdlastMoon: LocalDate = LocalDate.of(year, lastMoonMonth, lastMoonDay) // holds the variable for the full date of the last moon

    if (holdlastMoon.isBefore(today)) { // ask if the last before today
        holdlastMoon = holdlastMoon.plusDays(29.5.roundToLong()) // adds and rounds 29.5 days to calculate the next moon
        println("The next full moon will be: ${holdlastMoon.format(formatter)}") // prints the date if the next full moon
    }

}