package manera.tetris

import featurea.math.*
import featurea.opengl.*

private const val objectShader: String = """
#shader vertex(vec2 position)

mat4 projection;
mat4 view;
mat4 model;

void main() {
    outPosition = projection * view * model * vec4(position, 0, 1);
}

#shader pixel

vec3 tint;

void main() {
    outColor = vec4(tint, 1.0);
}
"""

private class ObjectProgram : Program(objectShader) {
    val projection: Matrix = uniforms["projection"]
    val view: Matrix = uniforms["view"]
    val model: Matrix = uniforms["model"]
    val tint: Vector3 = uniforms["tint"]
}

class ObjectGraphics {
    
    private val program: ObjectProgram = ObjectProgram()

    fun updateCamera(camera: Camera) {

    }

    fun draw(position: Point, rectangle: Rectangle) {
        
    }

}
