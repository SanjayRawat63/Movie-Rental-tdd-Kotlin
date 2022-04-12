package com.movierental

class Movie {
    companion object Type{
        val CHILDRENS = 2
        val REGULAR = 0
        val NEW_RELEASE = 1
    }

    private var title= String()
    private var priceCode:Int=0
    constructor(movietitle:String,  price:Int)
    {
        title=movietitle
        priceCode=price
    }
    fun getPriceCode(): Int {
        return priceCode
    }
    fun setPriceCode(arg: Int) {
        priceCode = arg
    }

    fun getTitle(): String {
        return title
    }
}