package part1

/**
闭包的作用
让函数成为编程语言中的一等公民
让函数具有对象所有的能力（封装）
让函数具有状态
 */


class Test {
    //斐波那契数列
    fun fibonacci(): () -> Long {
        var first = 0L
        var second = 1L

        return fun(): Long {
            val result = second
            second += first
            first = second - first
            return result
        }
    }


}

fun main(args: Array<String>) {

    val test = Test()
    val fi = test.fibonacci()
    println(fi())
    println(fi())
    println(fi())
    println(fi())
    println(fi())
    println(fi())
    println(fi())
    println(fi())
}

////////////////////////////////////////////////////

//Lambda表达式的完整语法可以用如下形式表示：
val sum = { x: Int, y: Int -> x + y }

//在kotlin中，有一个约定：如果函数的最后一个参数接收函数，那么作为相应的参数传入的Lambda表达式可以放在括号外面（尾随闭包），如下：
fun <T, R> Collection<T>.fold(initial: R, combine: (acc: R, nextElement: T) -> R): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

