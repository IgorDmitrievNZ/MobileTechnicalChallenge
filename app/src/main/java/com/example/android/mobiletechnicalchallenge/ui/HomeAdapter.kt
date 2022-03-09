package com.example.android.mobiletechnicalchallenge.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.mobiletechnicalchallenge.databinding.ItemCurrencyBinding
import com.example.android.mobiletechnicalchallenge.model.CurrenciesModel

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.CurrencyViewHolder>() {

    lateinit var currencyData: List<CurrenciesModel>
    private lateinit var binding: ItemCurrencyBinding

    @SuppressLint("NotifyDataSetChanged")
    fun setCurrency(data: List<CurrenciesModel>) {
        currencyData = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyViewHolder {
        binding = ItemCurrencyBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return CurrencyViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder, position: Int) {
        holder.bind(currencyData[position])
    }

    override fun getItemCount() = currencyData.size

    inner class CurrencyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(currency: CurrenciesModel) = with(binding) {

            currencyNameTextView.text = currency.currencyName
            abbreviationTextView.text = currency.currencyAbbreviation
            flagImageView.setImageResource(currency.currencyFlag)
            rateEditText.text = currency.currencyRate.toString()

        }
    }
}