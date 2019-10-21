package part1

//作用域详解

fun main(args: Array<String>) {
    println(run<Int> {
        1
    })
    //或者
    println(run {
        1
        2
    })

    //repeat比较简单，直接将函数体按指定次数执行。
    repeat(5) {
        print("repeat")
    }


    //with   要注意的是其返回值是根据return的类型或者最后一行代码来进行判断的。
    val list = arrayListOf<String>("1", "2", "3")
    with<List<String>, List<String>>(list, {
        list.add("4")
        list
    })

    //利用Lambda
    with<List<String>, List<String>>(list) {
        list.add("4")
        list
    }


}