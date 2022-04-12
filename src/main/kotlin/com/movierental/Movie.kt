package com.movierental

class Movie {
    companion object
    {
    val CHILDRENS = 2
    val REGULAR = 0
    val NEW_RELEASE = 1
}
    private var title: String? = null
    private var priceCode = 0

    fun Movie(title: String?, priceCode: Int) {
        this.title = title
        this.priceCode = priceCode
    }

    fun getPriceCode(): Int {
        return priceCode
    }

    fun setPriceCode(arg: Int) {
        priceCode = arg
    }

    fun getTitle(): String? {
        return title
    }
}