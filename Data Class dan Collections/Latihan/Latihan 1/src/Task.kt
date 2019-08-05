fun main() {

    // TODO 2
    val user = User("John", 23, "St. Petersburg")
    val newUser = user.copy()
    newUser.age = 25
    newUser.address = "Saint Petersburg"

    // TODO 4
    println("""User
        |Name: ${user.name}
        |Age: ${user.age}
        |Address: ${user.address}
        |
        |New User
        |Name: ${newUser.name}
        |Age: ${newUser.age}
        |Address: ${newUser.address}
        """.trimMargin())

}

// TODO 1
data class User(var name: String, var age: Int, var address: String)