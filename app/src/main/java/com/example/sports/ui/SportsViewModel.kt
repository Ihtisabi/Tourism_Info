package com.example.sports.ui

import androidx.lifecycle.ViewModel
import com.example.sports.data.LocalSportsDataProvider
import com.example.sports.model.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class SportsViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        SportsUiState(
            sportsList = LocalSportsDataProvider.getSportsData(),
            currentSport = LocalSportsDataProvider.getSportsData().getOrElse(0) {
                LocalSportsDataProvider.defaultSport
            }
        )
    )
    val uiState: StateFlow<SportsUiState> = _uiState

    fun updateCurrentSport(selectedSport: Place) {
        _uiState.update {
            it.copy(currentSport = selectedSport)
        }
    }

    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
        }
    }


    fun navigateToDetailPage() {
        _uiState.update {
            it.copy(isShowingListPage = false)
        }
    }
}

data class SportsUiState(
    val sportsList: List<Place> = emptyList(),
    val currentSport: Place = LocalSportsDataProvider.defaultSport,
    val isShowingListPage: Boolean = true
)
