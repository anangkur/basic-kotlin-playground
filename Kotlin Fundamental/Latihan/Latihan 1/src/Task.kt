fun main() {
    val now = 6
    val shopOpen = 7
    val shopClose = 17

    val shop = shopIsOpen(now, shopOpen, shopClose)

    println("Shop is open : $shop" )
}

// TODO
fun shopIsOpen(now: Int, shopOpen: Int, shopClose: Int) = now >= shopOpen && now <= shopClose