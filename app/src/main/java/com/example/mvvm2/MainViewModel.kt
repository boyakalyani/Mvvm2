package com.example.mvvm2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



class MainViewModel: ViewModel() {

    // Create the model which contains data for our UI
    private val model = DataModel(textForUI = "Here's the updated text!")

    // Create MutableLiveData which MainFragment can subscribe to
    // When this data changes, it triggers the UI to do an update
    val uiTextLiveData = MutableLiveData<String>()

    // Get the updated text from our model and post the value to MainFragment
    fun getUpdatedText() {
        val updatedText = model.textForUI
        uiTextLiveData.postValue(updatedText)
    }
}