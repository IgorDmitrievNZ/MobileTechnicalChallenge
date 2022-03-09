package com.example.android.mobiletechnicalchallenge.model

interface IRepo {

    fun getCurrencyFromLocalStorage(): List<CurrenciesModel>
}