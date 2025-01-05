package hu.bme.skincanceridentifier

import android.content.Context
import android.graphics.Bitmap
import co.zsmb.rainbowcake.withIOContext
import hu.bme.skincanceridentifier.IdentifierInteractor
import javax.inject.Inject

class IdentifierPresenter @Inject constructor(private val identifierInteractor: IdentifierInteractor) {

    suspend fun identify(image: Bitmap, context: Context): Float = withIOContext {
        return@withIOContext identifierInteractor.identify(image, context)
    }
}