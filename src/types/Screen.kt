package manera.tetris

import featurea.app.*
import featurea.input.*

class Screen : ApplicationDelegate {

    val layers = mutableListOf<Layer>()
    val hero: Hero = import()
    val context: Context = import()

    init {
        context.input.add(InputListener {
            
        })
    }

    override fun update(elapsedTime: Float) {
        for (layer in layers) {
            layer.update(elapsedTime)
        }
        for (layer in layers) {
            layer.draw(elapsedTime)
        }
    }

}
