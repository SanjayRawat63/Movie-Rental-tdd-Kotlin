package com.movierental

import java.util.stream.Collectors

class TextStatement {
    fun display(rentals: Rentals, customerName: String): String {
        var result: String = "Rental Record for " + customerName + "\n"
        result += rentals.stream()
            .map { rental -> "\t" + rental.movie.getTitle() + "\t" + (rental.amount()) + "\n" }
            .collect(Collectors.joining())
        result += "Amount owed is " + (rentals.totalAmount(rentals)) + "\n";
        result += "You earned " + (rentals.totalFrequentRenterPoints(rentals)) +
                " frequent renter points";
        return result;
    }
}
