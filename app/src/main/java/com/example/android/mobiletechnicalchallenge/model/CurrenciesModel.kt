package com.example.android.mobiletechnicalchallenge.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CurrenciesModel(
    val currencyFlag: Int,
    val currencyAbbreviation: String,
    val currencyName: String,
    val currencyRate: Double,
) : Parcelable
