package part1

import java.util.Arrays


//极易出现的错误及相应的解决方案


fun main(args: Array<String>) {

    /**
     * 不做展开操作 表示一个对象放进去
     */
    val myArray = arrayOf(1, 2, 3)
    val myList = Arrays.asList(myArray)
    println(myList.size)


    /**
     * 做了展开操作表示几个对象放进去
     */
    val myArray1 = arrayOf(1, 2, 3)
    val myList1 = Arrays.asList(*myArray1)
    println(myList1.size)



    //这里报错的原因是 Arrays.asList返回的是一个固定大小的list  是不能进行add remove操作的
    val myArray2 = arrayOf(1, 2, 3)
    val myList2 = Arrays.asList(*myArray2)
    myList2.add(4)
//    println(myList2)


}