import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

class NewTimeInterval(val time: TimeInterval, val num: Int)

operator fun TimeInterval.times(num: Int): NewTimeInterval = NewTimeInterval(this, num)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(timeInterval: NewTimeInterval): MyDate =
    addTimeIntervals(timeInterval.time, timeInterval.num)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}