package part1

//双冒号使用

//Kotlin 中 双冒号操作符 表示把一个方法当做一个参数，传递到另一个方法中进行使用，通俗的来讲就是引用一个方法。先来看一下例子：


class F {
    fun getResult(str1: String, str2: String): String = "result is {$str1 , $str2}"
    fun lock(p1: String, p2: String, method: (str1: String, str2: String) -> String): String {
        return method(p1, p2)
    }
}

fun main(args: Array<String>) {
    val f = F()
    //如果我们需要调用其他 Class 中的某一个方法是 要用这个class的对象来调用class::
    println(f.lock("param1", "param2", f::getResult))
}


//我们在 Class 中的某个方法中使用双冒号调用当前 Class 的内部方法时调动方式为：
class Test1 {

    private fun isOdd(x: Int) = x % 2 != 0

    fun test() {
        var list = listOf(1, 2, 3, 4, 5)
        println(list.filter(this::isOdd))
    }
}