package part1

import java.util.*


//展开操作符 *

fun main(args: Array<String>) {

    val intArr: Array<Int> = arrayOf(1, 2, 3, 4)
    val intArr1: Array<Int> = arrayOf(5, 6, 7, 8)
    val list4 = Arrays.asList(0, *intArr, *intArr1).run {
        println("size = $size")
        //因为这里用的run函数，所以返回最后一行数据，这里不返回一个this表示返回  println("size = $size")，这个集合打印出来会有问题
        this
    }
    println(list4)



   //展开运算符只能展开数组数据，不能展开一个可变长的列表。 可以理解为展开运算符遍历了一遍该数组。所以这里必须用Array<String> 不能用list

    val list1: Array<String> = arrayOf("two", "three", "four")
    val list2 = listOf("one", *list1)
    println(list2)


    //run函数的使用
    val list = arrayListOf(1, 2, 3)

    val result = list.run {
        println("my name is $list[0], I am ${list[1]} years old, my phone number is ${list[2]}")
        1000
    }
    println("result: $result")
}