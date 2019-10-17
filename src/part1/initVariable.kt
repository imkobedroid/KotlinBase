package part1


/**
 *  kotlin中有两种延迟初始化的方式。一种是lateinit var，一种是by lazy
 */


fun main(args: Array<String>) {
    val a = A()
    a.foo()
}


class A {
    //属性在声明的同时也要求要被初始化
    private var name: String? = ""
    private var age: Int? = null
    private var sex: String? = ""


    //lateinit var 只能修饰成员变量 不能修饰局部变量 并且不能修饰原始的数据类型
    private lateinit var name1: String
    private lateinit var age1: String
    private lateinit var sex1: String


    //by lazy  定义出来并没有初始化 而是在使用他的时候才开始负值
    val name2: String by lazy { "kobe" }

    fun foo() {
        val age2: String by lazy { "20" }
        println(age2)
    }

}