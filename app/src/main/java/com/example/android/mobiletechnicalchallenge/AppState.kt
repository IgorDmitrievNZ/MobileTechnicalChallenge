package com.example.android.mobiletechnicalchallenge

import com.example.android.mobiletechnicalchallenge.model.CurrenciesModel

open class AppState {
    data class Success(val currency: List<CurrenciesModel>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
