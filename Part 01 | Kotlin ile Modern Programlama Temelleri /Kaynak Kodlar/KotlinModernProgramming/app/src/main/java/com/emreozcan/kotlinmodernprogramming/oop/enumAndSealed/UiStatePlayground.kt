package com.emreozcan.kotlinmodernprogramming.oop.enumAndSealed

fun main() {
    //render(UiState.Loading)
    //render(UiState.Success("Kotlin Rocks!"))
    render(UiState.Error("Failed to fetch data"))
}

fun render(state: UiState) {
    when (state) {
        is UiState.Loading -> println("Loading...")
        is UiState.Success -> println("Data: ${state.data}")
        is UiState.Error -> println("Error: ${state.message}")
    }
}