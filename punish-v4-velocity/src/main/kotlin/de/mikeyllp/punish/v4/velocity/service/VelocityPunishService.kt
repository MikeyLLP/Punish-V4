package de.mikeyllp.punish.v4.velocity.service

import de.mikeyllp.punish.v4.core.service.PunishService
import de.mikeyllp.punish.v4.velocity.plugin
import net.kyori.adventure.text.Component
import java.util.UUID

class VelocityPunishService : PunishService {
    override fun kickPlayer(playerUuid: UUID, reason: String) {
        plugin.proxy.getPlayer(playerUuid).ifPresent {
            it.disconnect(Component.text(reason))
        }
    }

    override fun banPlayer(playerUuid: UUID, time: Long, reason: String) {
        //TODO: Implement Database for better Bans
    }

    override fun mutePlayer(playerUuid: UUID, time: Long, reason: String) {
        //TODO: Implement Database for better Mutes
    }

    override fun warnPlayer(playerUuid: UUID, reason: String) {
        //TODO: Implement Database for better Warns
    }
}