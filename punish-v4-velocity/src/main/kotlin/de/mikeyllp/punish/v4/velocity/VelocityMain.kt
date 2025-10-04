package de.mikeyllp.punish.v4.velocity

import com.google.inject.Inject
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.proxy.ProxyServer
import de.mikeyllp.punish.v4.core.service.CoreService
import de.mikeyllp.punish.v4.velocity.commands.punishCommand
import de.mikeyllp.punish.v4.velocity.service.VelocityPunishService

class VelocityMain @Inject constructor(
    val proxy: ProxyServer,
) {

    @Subscribe
    fun onInitialization(event: ProxyInitializeEvent) {
        INSTANCE = this
        CoreService.punishService = VelocityPunishService()

        punishCommand()
    }

    companion object {
        lateinit var INSTANCE: VelocityMain
            private set
    }
}

val plugin get() = VelocityMain.INSTANCE