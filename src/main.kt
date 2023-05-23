package manera.tetris

fun main() = runApplication(runtime = manera.tetris.artifact) {
    val app: Application = import()
    val loader: Loader = import()

    loader.load(bootstrapResources) {
        app.delegate = Screen()
    }
}
