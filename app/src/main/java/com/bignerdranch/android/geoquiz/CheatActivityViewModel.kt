package com.bignerdranch.android.geoquiz

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

private const val KEY_IS_CHEATER = "is_cheater"

class CheatActivityViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var isCheater: Boolean
        get() = savedStateHandle.get(KEY_IS_CHEATER) ?: false
        set(value) = savedStateHandle.set(KEY_IS_CHEATER, value)
}
