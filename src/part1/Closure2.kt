package part1

/**
闭包的作用
让函数成为编程语言中的一等公民
让函数具有对象所有的能力（封装）
让函数具有状态
 */


//Lambda表达式的例子

//标准的Lambda表达式
//val sum = {x: Int, y: Int -> x + y }


fun main(args: Array<String>) {

//    var value = 0
//    var localValue = 20
//
//    val result = { a: Int ->
//        value += 1
//        localValue += 1
//        val c = value + localValue + a
//        println(c)
//
//    }
//
//    result(30)
//
//    println(value)
//    println(localValue)
//
//
//    //Lambda 表达式的完整语法形式如下：
//    val sum: (a: Int, b: Int) -> Int = { a: Int, b: Int -> a + b }
//    val sum1: (Int, Int) -> Int = { a, b -> a + b }
//

    val c = C()
    val d = c.test(1) { a -> a + 1 }
    println(d())
}


class C {
    fun test(a: Int, b: (Int) -> Int): () -> Int {
        return fun(): Int {
            return a + b(a)
        }
    }

    fun test1(a: Int, b: (Int) -> Int): () -> Int {
        return {
            a + b(a)
        }
    }


    fun test2(a: Int, b: () -> Int): Int {
        return a
    }

}

