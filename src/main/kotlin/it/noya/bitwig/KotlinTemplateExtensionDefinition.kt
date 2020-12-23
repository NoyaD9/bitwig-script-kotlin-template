package it.noya.bitwig

import com.bitwig.extension.api.PlatformType
import com.bitwig.extension.controller.AutoDetectionMidiPortNamesList
import com.bitwig.extension.controller.ControllerExtensionDefinition
import com.bitwig.extension.controller.api.ControllerHost
import java.util.*

class KotlinTemplateExtensionDefinition : ControllerExtensionDefinition() {

    override fun getName(): String = "Kotlin Template"

    override fun getAuthor(): String = "Your Name"

    override fun getVersion(): String = "0.1"

    override fun getId(): UUID = DRIVER_ID

    override fun getHardwareVendor(): String = "Kotlin"

    override fun getHardwareModel(): String = "Template"

    override fun getRequiredAPIVersion(): Int = 12

    override fun getNumMidiInPorts(): Int = 0

    override fun getNumMidiOutPorts(): Int = 0

    override fun listAutoDetectionMidiPortNames(list: AutoDetectionMidiPortNamesList, platformType: PlatformType) {
        when (platformType) {
            PlatformType.WINDOWS, PlatformType.MAC, PlatformType.LINUX -> {
            }
        }
    }

    override fun createInstance(host: ControllerHost): KotlinTemplateExtension {
        return KotlinTemplateExtension(this, host)
    }

    companion object {
        //FIXME: generate your own UUID https://www.uuidgenerator.net/version1
        private val DRIVER_ID = UUID.fromString("3e586350-44a7-11eb-b378-0242ac130002")
    }
}