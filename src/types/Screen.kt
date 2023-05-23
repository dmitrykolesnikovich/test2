package manera.tetris

import featurea.app.*
import featurea.input.*

class Screen : ApplicationDelegate {

    private val context: Context = import()

    val layers = mutableListOf<Layer>()
    val hero: Hero = import()
    
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
