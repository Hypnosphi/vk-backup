@file:JsModule("path")

package node.path

external fun basename(fileName: String): String

external fun join(vararg chunks: String): String
