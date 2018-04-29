@file:JsModule("node-vk-sdk")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package vk.sdk

import kotlin.js.*

external open class ConsoleLogger : BaseLogger {
    override fun log(prefix: String, data: Any? /* null */): Unit = definedExternally
    override fun warn(prefix: String, data: Any? /* null */): Unit = definedExternally
    override fun error(prefix: String, data: Any? /* null */): Unit = definedExternally
    open fun prepareLog(color: Any, tag: Any, prefix: Any, data: Any? = definedExternally /* null */): Unit = definedExternally
}
