package com.animal.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.animal.repository.AnimalRepository
import java.lang.IllegalArgumentException
import javax.inject.Inject

class MainActivityFactory @Inject constructor(private var animalRepository: AnimalRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        with(modelClass) {
            @Suppress("UNCHECKED_CAST")
            when {
                isAssignableFrom(MainActivityViewModel::class.java) ->
                    MainActivityViewModel(animalRepository) as T
                else -> throw IllegalArgumentException("Unknown View Model Class")
            }
        }
}