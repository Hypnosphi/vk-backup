@file:JsModule("fs")

package node.fs

external fun copyFile(src: String, dst: String, callback: (Error?) -> Unit)

external fun mkdir(path: String, callback: (Error?) -> Unit)

external fun writeFile(path: String, data: String, callback: (Error?) -> Unit)
