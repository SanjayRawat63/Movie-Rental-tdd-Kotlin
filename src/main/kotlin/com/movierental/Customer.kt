package com.movierental

class Customer {
    private var name:String
    private val rentals: MutableList<Rental> = ArrayList()

    fun addRental(arg: Rental) {
        rentals.add(arg)
    }
    constructor(name:String)
    {
        this.name=name;
    }

    fun statement(): String {
        var totalAmount = 0.0
        var frequentRenterPoints = 0
        var result = "Rental Record for $name\n"
        for (each in rentals) {
            var thisAmount = 0.0
            when (each.getMovie()?.getPriceCode()) {
                Movie.REGULAR -> {
                    thisAmount += 2.0
                    if (each.getDaysRented() > 2) thisAmount += (each.getDaysRented() - 2) * 1.5
                }
                Movie.NEW_RELEASE -> thisAmount += (each.getDaysRented() * 3).toDouble()
                Movie.CHILDRENS -> {
                    thisAmount += 1.5
                    if (each.getDaysRented() > 3) thisAmount += (each.getDaysRented() - 3) * 1.5
                }
            }
            // add frequent renter points
            frequentRenterPoints++
            // add bonus for a two day new release rental
            if (each.getMovie()?.getPriceCode() == Movie.NEW_RELEASE
                &&
                each.getDaysRented() > 1
            ) frequentRenterPoints++

            //show figures for this rental
            result += """	${each.getMovie()?.getTitle()}	$thisAmount
"""
            totalAmount += thisAmount
        }

        //add footer lines result
        result += "Amount owed is $totalAmount\n"
        result += "You earned $frequentRenterPoints frequent renter points"
        return result
    }
}