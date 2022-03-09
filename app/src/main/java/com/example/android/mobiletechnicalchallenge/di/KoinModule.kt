package com.example.android.mobiletechnicalchallenge.di

import com.example.android.mobiletechnicalchallenge.model.IRepo
import com.example.android.mobiletechnicalchallenge.model.RepoImpl
import com.example.android.mobiletechnicalchallenge.ui.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<IRepo> { RepoImpl() }  // realisation of a repository

//View models
    viewModel { HomeViewModel(get()) }     //searching view model
}