package com.example.android.mobiletechnicalchallenge.model

import com.example.android.mobiletechnicalchallenge.R

class RepoImpl : IRepo {

    private val repositories =
        listOf(
            CurrenciesModel(R.drawable.afn, "AFN", "Afghan Afghani", 1.0),
            CurrenciesModel(R.drawable.bam, "BAM", "Bosnia and Herzegovina dinar", 2.0),
            CurrenciesModel(R.drawable.aud, "AUD", "Australian Dollar", 3.0),
            CurrenciesModel(R.drawable.nzd, "NZD", "New Zealand Dollar", 3.0),
            CurrenciesModel(R.drawable.btn, "BTN", "Bhutanese ngultrum", 5.0),
            CurrenciesModel(R.drawable.afn, "AFN", "Afghan Afghani", 6.0),
            CurrenciesModel(R.drawable.bam, "BAM", "Bosnia and Herzegovina dinar", 7.0),
            CurrenciesModel(R.drawable.aud, "AUD", "Australian Dollar", 8.0),
            CurrenciesModel(R.drawable.nzd, "NZD", "New Zealand Dollar", 9.0),
            CurrenciesModel(R.drawable.btn, "BTN", "Bhutanese ngultrum", 10.0),
            CurrenciesModel(R.drawable.afn, "EUR", "Afghan Afghani", 1.0),
            CurrenciesModel(R.drawable.bam, "BAM", "Bosnia and Herzegovina dinar", 2.0),
            CurrenciesModel(R.drawable.aud, "AUD", "Australian Dollar", 3.0),
            CurrenciesModel(R.drawable.nzd, "NZD", "New Zealand Dollar", 3.0),
            CurrenciesModel(R.drawable.btn, "BTN", "Bhutanese ngultrum", 5.0),
            CurrenciesModel(R.drawable.afn, "AFN", "Afghan Afghani", 6.0),
            CurrenciesModel(R.drawable.bam, "BAM", "Bosnia and Herzegovina dinar", 7.0),
            CurrenciesModel(R.drawable.aud, "AUD", "Australian Dollar", 8.0),
            CurrenciesModel(R.drawable.nzd, "NZD", "New Zealand Dollar", 9.0),
            CurrenciesModel(R.drawable.btn, "BTN", "Bhutanese ngultrum", 10.0),
            CurrenciesModel(R.drawable.afn, "AFN", "Afghan Afghani", 1.0),
            CurrenciesModel(R.drawable.bam, "BAM", "Bosnia and Herzegovina dinar", 2.0),
            CurrenciesModel(R.drawable.aud, "AUD", "Australian Dollar", 3.0),
            CurrenciesModel(R.drawable.nzd, "NZD", "New Zealand Dollar", 3.0),
            CurrenciesModel(R.drawable.btn, "BTN", "Bhutanese ngultrum", 5.0),
            CurrenciesModel(R.drawable.afn, "EUR", "Afghan Afghani", 6.0),
            CurrenciesModel(R.drawable.bam, "BAM", "Bosnia and Herzegovina dinar", 7.0),
            CurrenciesModel(R.drawable.aud, "AUD", "Australian Dollar", 8.0),
            CurrenciesModel(R.drawable.nzd, "NZD", "New Zealand Dollar", 9.0),
            CurrenciesModel(R.drawable.btn, "BTN", "Bhutanese ngultrum", 10.0),
        )

    override fun getCurrencyFromLocalStorage(): List<CurrenciesModel> {
        return repositories
    }

}