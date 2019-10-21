package part1

import java.io.File


class D {

    var URL: String? = "https://www.baidu.com"
    var name: String? = null
    var age: Int? = null


    // also与let的链式调用
    fun makeDir(path: String): File {
        val result = File(path)
        result.mkdirs()
        return result
    }

    // 改进方法
    fun makeDir1(path: String) = path.let { File(it) }.also { it.mkdirs() }

    //或者 （这里使用let主要是判断是不是为空）
    fun makeDir2(path: String) = File(path).also { it.mkdirs() }


    //条件判断
    val url = URL?.takeIf { it == "https://www.baidu.com" } ?: run {
        println("url不是百度")
        URL = "https://www.baidu.com"
    }

    //或者
    val url1 = URL?.takeIf { it == "https://www.longyuan.com" } ?: run {
        println("url不是龙渊")
        URL = "https://www.baidu.com"
    }
}

//结合函数的使用
fun main(args: Array<String>) {

    val d = D()

    d.name?.let {
        println(it)
    }
    //或者
    d.name = "kobe"
    d.name?.let {
        println(it)
    }


    //利用apply连接操作
    val d1 = D().apply {
        name = "kobe-apply"
        age = 1
    }
    println(d1.name + "  " + d1.age)


}