package hu.bme.skincanceridentifier

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import hu.bme.skincanceridentifier.ml.Model
import org.tensorflow.lite.support.image.TensorImage
import javax.inject.Inject

class IdentifierInteractor @Inject constructor() {
    fun identify(image: Bitmap, context: Context): Float {
        val model = Model.newInstance(context)

        val tensorImage = TensorImage.fromBitmap(image)

        val outputs = model.process(tensorImage)
        val probability = outputs.probabilityAsTensorBuffer

        model.close()

        Log.i("probability", probability.floatArray[0].toString())
        return probability.floatArray[0]
    }
}