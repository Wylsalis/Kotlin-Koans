data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(snd: MyDate): Int {
        if (year != snd.year) return year - snd.year
        else if (month != snd.month) return month - snd.month
        return dayOfMonth - snd.dayOfMonth
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}