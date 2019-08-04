fun main() {

    // TODO 2
    val user = User()John", 23, "St. Peteval newUser = User()O 3
    val newUser println()py()
    newUseclass User()   newUser.address = "Saint Petersburg"

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
data class User(val name: String, var age: Int, var address: String)