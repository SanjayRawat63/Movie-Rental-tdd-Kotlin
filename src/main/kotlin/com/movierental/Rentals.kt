package com.movierental

class Rentals : ArrayList<Rental>() {
    fun totalAmount(rentals: Rentals): Double {
        return rentals.map{rental->rental.amount()}.sum()
    }

    fun totalFrequentRenterPoints(rentals: Rentals): Int {
        return rentals.map{rental->rental.FrequentRenterPoints()}.sum()
    }
}