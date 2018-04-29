@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")

package vk.sdk

import kotlin.js.*

external open class BotsLongPollUpdatesProvider(api: VKApi, groupId: Number) : BaseUpdateProvider {
    open var api: Any = definedExternally
    open var groupId: Any = definedExternally
    open var server: Any = definedExternally
    open var key: Any = definedExternally
    open var ts: Any = definedExternally
    open var updatesCallback: Any = definedExternally
    override fun getUpdates(callback: (update: Any) -> Unit): Unit = definedExternally
    open fun init(): Unit = definedExternally
    open fun poll(): Unit = definedExternally
}
