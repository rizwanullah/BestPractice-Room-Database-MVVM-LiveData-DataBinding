package com.animal.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.animal.models.AnimalModel
import com.animal.repository.AnimalRepository
import com.animal.utils.BaseViewModel

class MainActivityViewModel
    (var animalRepository: AnimalRepository) : BaseViewModel() {

    val dataUpdated = MutableLiveData<Boolean>()

    fun insertData(model: AnimalModel) {
        animalRepository.insertData(model)
        dataUpdated.postValue(true)
    }

    fun updateData(animalModel: AnimalModel) {
        animalRepository.updateData(animalModel)
        dataUpdated.postValue(true)
    }

    fun updateData(animalID: Int, isFav: Boolean) {
        animalRepository.updateData(animalID, isFav)
        dataUpdated.postValue(true)
    }

    fun getData(): LiveData<List<AnimalModel>> {
        return animalRepository.getPostData()!!
    }

    fun deleteData(animal: AnimalModel) {
        animalRepository.deletePost(animal)!!
        dataUpdated.postValue(true)
    }
}