package it.noya.bitwig

import com.bitwig.extension.controller.ControllerExtension
import com.bitwig.extension.controller.api.ControllerHost
import com.bitwig.extension.controller.api.Transport

class KotlinTemplateExtension(
    definition: KotlinTemplateExtensionDefinition,
    host: ControllerHost
) : ControllerExtension(definition, host) {

    private lateinit var transport: Transport

    override fun init() {
        val host = host
        transport = host.createTransport()

        // TODO: Perform your driver initialization here.
        // For now just show a popup notification for verification that it is running.
        host.showPopupNotification("Kotlin Template Initialized")
    }

    override fun exit() {
        // TODO: Perform any cleanup once the driver exits
        // For now just show a popup notification for verification that it is no longer running.
        host.showPopupNotification("Kotlin Template Exited")
    }

    override fun flush() {
        // TODO Send any updates you need here.
    }
}