package hu.bme.skincanceridentifier

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import hu.bme.skincanceridentifier.ml.Model
import org.tensorflow.lite.support.image.TensorImage
import javax.inject.Inject

class IdentifierInteractor @Inject constructor() {
    fun identify(image: Bitmap, context: Context): String {
        val model = Model.newInstance(context)

        val tensorImage = TensorImage.fromBitmap(image)

        val outputs = model.process(tensorImage)
        val probability = outputs.probabilityAsTensorBuffer

        try {
            val probability2 = outputs.probabilityAsCategoryList
        } catch (e: Exception) {
            Log.i("probability_exception", e.toString())
        }

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
        //val maxScore = probability.maxByOrNull { p -> p.score }!!

        //return "Prediction:" + "\n" + maxScore.label + "\n" + "Probability: " + (maxScore.score * 10).toInt() + "%"
        return predStr
    }
}