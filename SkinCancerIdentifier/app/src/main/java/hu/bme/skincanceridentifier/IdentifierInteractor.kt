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

        val result: Float =  probability.floatArray[0]
        var predStr = ""
        if (result < 0.5) {
            // means prediction was for category corresponding to 0
            predStr = "Prediction: Benign"
        } else {
            // means prediction was for category corresponding to 1
            predStr = "Prediction: Malignant"
        }

        model.close()

        return probability.floatArray[0]
    }
}