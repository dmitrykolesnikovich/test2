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