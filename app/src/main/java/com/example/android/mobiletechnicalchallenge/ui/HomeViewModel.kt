package com.example.android.mobiletechnicalchallenge.ui

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.mobiletechnicalchallenge.AppState
import com.example.android.mobiletechnicalchallenge.model.IRepo
import java.lang.Thread.sleep

class HomeViewModel(
    private val repository: IRepo,
) : ViewModel(), LifecycleObserver {

    private val liveData: MutableLiveData<AppState> = MutableLiveData()
    fun getLiveData(): LiveData<AppState> = liveData

    fun getCurrencyFromLocalSource() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveData.value = AppState.Loading
        Thread {
            sleep(2000)
            liveData.postValue(
                AppState.Success(repository.getCurrencyFromLocalStorage())
            )
        }.start()
    }

}