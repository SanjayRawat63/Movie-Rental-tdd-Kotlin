package com.movierental

data class Customer(val name: String) {
    var rentals = Rentals()

    fun addRental(rental: Rental) {
        rentals.add(rental)
    }

    fun Textstatement(): String {
        return TextStatement().display(rentals, name)
    }

    fun Htmlstatement(): String {
        return HtmlStatement().display(rentals, name)
    }

}