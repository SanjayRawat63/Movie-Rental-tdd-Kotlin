package com.movierental
import java.util.stream.Collectors

class HtmlStatement {
    fun display(rentals: Rentals, customerName:String):String {
        var result:String = "<h1>Rental Record for <b>" + customerName + "</b></h1><br>";
        result += rentals.stream().map { rental ->
            rental.movie.getTitle() + " " +
                    (rental.amount()) + "<br>"
        }.collect(Collectors.joining())
        result += "Amount owed is <b>" + (rentals.totalAmount(rentals)) + "</b> <br>";
        result += "You earned <b>" + (rentals.totalFrequentRenterPoints(rentals)) +
                "</b> frequent renter points";
        return result;
    }
}