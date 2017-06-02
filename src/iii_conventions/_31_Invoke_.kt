package iii_conventions

import util.TODO
import v_builders.data.cigar


class Invokable {

    var count:Int = 0

    fun getNumberOfInvocations(): Int {
        return count;
    }

    operator fun invoke():Invokable {
        count++
        return this
    }
}

fun todoTask31(): Nothing = TODO(
    """
        Task 31.
        Change class Invokable to count the number of invocations (round brackets).
        Uncomment the commented code - it should return 4.
    """,
    references = { invokable: Invokable -> })

fun task31(invokable: Invokable): Int {
    return invokable()()()().getNumberOfInvocations()
}
