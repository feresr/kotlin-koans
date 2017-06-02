package i_introduction._3_Default_Arguments

fun todoTask3(name: String, number: Number = 42, toUpperCase: Boolean = false): String {

    var result: String;

    if (toUpperCase) {
        result = name.toUpperCase()
    } else {
        result = name
    }

    return result + number;
}


fun task3(): String {
    return (todoTask3("a") +
            todoTask3("b", number = 1) +
            todoTask3("c", toUpperCase = true) +
            todoTask3(name = "d", number = 2, toUpperCase = true))
}
