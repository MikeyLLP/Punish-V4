package de.mikeyllp.punish.v4.velocity

import com.velocitypowered.api.event.Subscribe

class VelocityMain constructor() {

    @Subscribe
    fun onInitialization() {
        INSTANCE = this
    }

    companion object {
        lateinit var INSTANCE: VelocityMain
            private set
    }
}

val plugin get() = VelocityMain.INSTANCE