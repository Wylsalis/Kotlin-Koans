class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        val it = object : Iterator<MyDate> {
            var curr: MyDate = start

            override fun hasNext(): Boolean {
                return curr <= end
            }

            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()
                val res = curr
                curr = curr.followingDate()
                return res
            }
        }
        return it
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}