#shader vertex(vec2 position)
#raster output(vec4 position)

mat4 projection;
mat4 view;
mat4 model;

void main() {
    output.position = projection * view * model * vec4(vertex.position, 0, 1);
}

#shader pixel
#raster output(vec4 color)

vec3 tint;

void main() {
    output.color = vec4(tint, 1.0);
}
