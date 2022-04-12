package com.movierental

class Rental {
    private val daysRented: Int
    private var movie: Movie? =null

     constructor(movie: Movie?, daysRented: Int) {
        this.movie = movie
        this.daysRented = daysRented
    }

    fun getDaysRented(): Int {
        return daysRented
    }

    fun getMovie(): Movie? {
        return movie
    }
}