package manera.tetris

import featurea.math.*
import featurea.opengl.*

private class ObjectProgram : Program(objectShader) {
    var projection: Matrix = uniforms["projection"]
    var view: Matrix = uniforms["view"]
    var model: Matrix = uniforms["model"]
    var tint: Vector3 = uniforms["tint"]
}

class ObjectGraphics {
    
    private val program: ObjectProgram = ObjectProgram()

    fun tint(tint: Vector3) {
        program.tint = tint
    }

    fun camera(camera: Camera) {

    }

    fun draw(position: Point, rectangle: Rectangle) {
        
    }

}
