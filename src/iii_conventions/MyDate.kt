package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {


    override fun compareTo(other: MyDate): Int {

        if (this.year != other.year) {
            if (this.year > other.year) {
                return 1
            } else {
                return -1
            }
        } else {
            if (this.month != other.month) {
                if (this.month > other.month) {
                    return 1
                } else {
                    return -1
                }
            } else {
                if (this.dayOfMonth != other.dayOfMonth) {
                    if (this.dayOfMonth > other.dayOfMonth) {
                        return 1
                    } else {
                        return -1
                    }
                }
            }
        }

        return 0
    }
}


enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterable<MyDate> {

    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current: MyDate = start.previousDay()
            override fun hasNext(): Boolean {
                return current.nextDay() <= endInclusive
            }

            override fun next(): MyDate {
                current = current.nextDay()
                return current
            }
        }
    }

    operator fun contains(d: MyDate): Boolean {
        return d in start..endInclusive
    }
}
