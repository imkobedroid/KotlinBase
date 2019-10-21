package part1

//作用域

//run
//函数体内使用this代替本对象。返回值为函数最后一行或者return指定的表达式
//
//let
//函数内使用it代替本对象。返回值为函数最后一行或者return指定的表达式。
//
//apply
//函数内使用this代替本对象。返回值为本对象。
//
//also
//函数内使用it代替本对象。返回值为本对象。
//
//takeIf
//条件为真返回对象本身否则返回null。
//
//takeUnless
//条件为真返回null否则返回对象本身。
//
//with
//with比较特殊，不是以扩展方法的形式存在的，而是一个顶级函数。
//传入参数为对象，函数内使用this代替对象。
//返回值为函数最后一行或者return指定的表达式。
//
//repeat
//将函数体执行多次。


class TestBean {
    var name: String = "kobe"
    var age = 10
}


fun main(args: Array<String>) {
    val testBean = TestBean()
    val resultRun = testBean.run {
        name = "kobe-run"
        age = 3
        println("Run内部 $this")
        age
    }
    println("run返回值 $resultRun")


    val resultLet = testBean.let {
        it.name = "kobe-left"
        it.age = 4
        println("let内部 $it")
        it.age
    }
    println("let返回值 $resultLet")


    val resultApply = testBean.apply {
        name = "kobe-apply"
        age = 4
        println("apply内部 $this")
        age
    }
    println("Apply返回值 $resultApply")


    val resultAlso = testBean.also {
        it.name = "xys"
        it.age = 3
        println("also内部 $it")
        it.age
    }
    println("also返回值 $resultAlso")

    val resultWith = with(testBean) {
        name = "xys"
        age = 3
        println("with内部 $this")
        age
    }
    println("with返回值 $resultWith")


    testBean.age = 33
    val resultTakeIf = testBean.takeIf {
        it.age > 3
    }
    println("takeIf $resultTakeIf")


    val resultTakeUnless = testBean.takeUnless {
        it.age > 3
    }
    println("takeUnless $resultTakeUnless")

//    虽然also和apply都是返回this，但国际惯例，它们在使用的时候，还是有一些细微的差别的，also强调的是【与调用者无关的操作】，而apply强调的是【调用者的相关操作】，例如下面的这个例子。
    testBean.also { println("also的操作") }.apply { name = "apply的操作" }

    //let和run的返回值相同，它们的区别主要在于作用域内使用it和this的区别。一般来说，如果调用者的属性和类中的属性同名，则一般会使用let，避免出现同名的赋值引起混乱。 国际惯例，run通常使用在链式调用中，进行数据处理、类型转换，例如?.run{}的使用。

}