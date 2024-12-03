package hu.bme.skincanceridentifier

import android.graphics.Bitmap

sealed class IdentifierViewState

object Loading : IdentifierViewState()

data class IdentifierContent(
    var prediction: String = "",
    var image: Bitmap? = null,
    val loading: Boolean = false
) : IdentifierViewState()