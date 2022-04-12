package com.movierental

data class Rental(val movie: Movie, val daysRented: Int) {
    fun amount(): Double {
        var thisAmount = 0.0
        when (movie.getPriceCode()) {
            Movie.REGULAR -> {
                thisAmount += 2.0
                if (daysRented > 2) thisAmount += (daysRented - 2) * 1.5
            }
            Movie.NEW_RELEASE -> thisAmount += (daysRented * 3).toDouble()

            Movie.CHILDRENS -> {
                thisAmount += 1.5
                if (daysRented > 3) thisAmount += (daysRented - 3) * 1.5
            }
        }
        return thisAmount
    }

    fun FrequentRenterPoints(): Int {
        var frequentRenterPoints = 1
        if (isBonusApplicable()) frequentRenterPoints++
        return frequentRenterPoints
    }


    private fun isBonusApplicable(): Boolean {
        return (movie.getPriceCode() === Movie.NEW_RELEASE
                &&
                daysRented > 1)
    }

}
