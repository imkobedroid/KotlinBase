package part1


//with函数的使用  返回最后一行

/*
*打印字母表函数，在函数内result变量在好几处有使用到
* */
fun alphabet(): String {
    val result = StringBuilder()
    result.append("START\n")
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nEND")
    return result.toString()
}

//用with修改

fun alphabet1(): String {
    val result = StringBuilder()
    return with(result) {
        append("START\n")
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nEND")
        toString()
    }
}