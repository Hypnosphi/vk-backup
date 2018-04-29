import node.fs.*
import node.path.*

external interface PackageJSON

@JsModule("@jetbrains/kotlin-webpack-plugin/libraries-lookup")
external object librariesLookup {
    fun lookupKotlinLibraries(packages: Array<PackageJSON>): Array<String>
}

@JsModule("../../package.json")
external val packageJSON: PackageJSON

val rethrow: (Error?) -> Unit = {
    if (it != null) throw it
}

fun main(args: Array<String>) {
    val dest = "dist/node_modules"
    mkdir(dest) {
        librariesLookup.lookupKotlinLibraries(arrayOf(packageJSON))
            .forEach {
                copyFile(it, join(dest, basename(it)), rethrow)
            }
    }
}