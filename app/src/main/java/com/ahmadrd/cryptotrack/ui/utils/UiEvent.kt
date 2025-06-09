package com.ahmadrd.cryptotrack.ui.utils

sealed class UiEvent {
    data class ShowToast(val message: String) : UiEvent()
}