package node.process

external object process {
    fun exit(code: Int)
    val env: dynamic
}
