package de.mikeyllp.punish.v4.velocity

import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent

class VelocityMain constructor() {

    @Subscribe
    fun onInitialization(event: ProxyInitializeEvent) {
        INSTANCE = this
    }

    companion object {
        lateinit var INSTANCE: VelocityMain
            private set
    }
}

val plugin get() = VelocityMain.INSTANCE