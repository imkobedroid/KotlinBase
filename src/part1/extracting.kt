package part1


//抽取相同的代码

class User(val id: Int, val name: String, val address: String, val email: String)

fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Address")
    }
    if (user.email.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Email")
    }
}


//上面的代码可以抽取出来写成一个方法
fun saveUser2(user: User) {
    fun validate(value: String, fildName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fildName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
    validate(user.email, "Email")
}


//也可以使用扩展函数来写
fun User.saveUser3() {
    fun validate(value: String, fildName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${this.id}: empty $fildName")
        }
    }
    validate(this.name, "Name")
    validate(this.address, "Address")
    validate(this.email, "Email")
}