package com.example.retrofit

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.data.model.Game
import com.example.retrofit.data.network.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _games = MutableStateFlow<List<Game>?>(null)
    val games: StateFlow<List<Game>?> = _games

    val api= RetrofitInstance.apiClient

    fun getGames() {
        viewModelScope.launch {
            val response = api.getGames()
            if (response.isSuccessful) {
                _games.value = response.body()
            }




            }
    }
}