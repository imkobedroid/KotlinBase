package part1

/**
闭包的作用
让函数成为编程语言中的一等公民
让函数具有对象所有的能力（封装）
让函数具有状态
 */


/**
java中对象是一等公民，对象有状态
函数是没有状态的，调用完毕后，里面的数据会被回收，不会被保存
 */


/**
public class Test {

public void test(){

public void test(){

}
}
}

方法里面 放方法。报错,java没办法理解这种代码,在java中 函数是二等公民
二等公民是不可以出现在函数里面的。他只能出现在类的定义里
 */


fun test() {
    val str = ""
    fun getStr(): String {
        return str
    }
}


//kotlin里面函数和普通变量一样是一等公民，他可以拥有一等公民拥有的所有主权，。
//好处，可以在函数的内部声明函数
//函数参数可以是函数，函数的返回值可以是函数
//这就是函数编程的特点


///////////////////////////////////////////////////////////////////////////////////


//普通函数和闭包函数

//普通函数不携带状态，调用完毕后里面所有的内容就会被释放掉。
//下次调用的时候，里面的变量会再次去声明,函数不携带状态，维护起来就需要额外的成本，比如我们需要声明一个额外的变量来记录他的状态。

fun test1() {
    val a = 3
    println(a)
}

//fun main(args: Array<String>) {
//    test1()
//}


//闭包让函数可以携带状态。
fun test2(): () -> Int {
    var str = 0
    return fun(): Int {
        return str++
    }
}

fun main(args: Array<String>) {
    val makeFun = test2()
    println(makeFun())
    println(makeFun())
    println(makeFun())
    println(makeFun())


//    println(test2().invoke())
//    println(test2().invoke())
//    println(test2().invoke())
//    println(test2().invoke())
//    println(test2().invoke())
}

//函数里面声明函数，函数里面返回函数，就是闭包
//
//1.函数内部的局部变量的状态保存住了 （变量的值就是状态）
//
//2.  str 被隐藏起来了，但我们调用函数可以改变状态，或者获得str的值，这点就是函数的面向对象，让函数具有封装的能力，让函数既有了状态。

//程序的变量分为全局变量和局部变量，全局变量，顾名思义，其作用域是当前文件甚至文件外的所有地方；而局部变量，我们只能再其有限的作用域里获取。
//那么，如何在外部调用局部变量呢？答案就是——闭包，与此给闭包下个定义：闭包就是能够读取其他函数内部变量的函数