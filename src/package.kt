package manera.tetris

import manera.tetris.Resources.enemyPng
import manera.tetris.Resources.heroPng

val artifact = Artifact("manera.tetris") {
    include(featurea.audio.artifact)
    include(featurea.graphics.artifact)
    include(featurea.input.artifact)
    include(featurea.keyboard.artifact)

    component("Context") { Context() }
    component("Enemy") { Enemy() }
    component("Hero") { Hero() }
}

class Context {
    val audio: Audio = import()
    val graphics: Graphics = import()
    val input: Input = import()
    val keyboard: Keyboard = import()
}

/*content*/

static object Resources {
    const val enemyPng: String = "images/enemy.png"
    const val heroPng: String = "images/hero.png"    
}

val bootstrapResources: List<String> = list(
    enemyPng, 
    heroPng,
)
