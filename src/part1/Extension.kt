package part1

//扩展函数


//获取最后一个字符
fun String.getLastChar() = this[this.length - 1]


class G {

    //扩展属性
    val String.lastChar: Char
        get() = get(length - 1)


    var StringBuilder.lastChar1: Char
        get() = get(length - 1)
        set(value) {
            setCharAt(length - 1, value)
        }

}

fun main(args: Array<String>) {
    println("abcdefg".getLastChar())

}