package de.mikeyllp.punish.v4.velocity.service

import de.mikeyllp.punish.v4.core.service.IDService
import de.mikeyllp.punish.v4.core.service.PunishService
import de.mikeyllp.punish.v4.velocity.plugin
import de.mikeyllp.punish.v4.velocity.util.appendKickPrefix
import de.mikeyllp.punish.v4.velocity.util.appendScreen
import dev.slne.surf.surfapi.core.api.messages.adventure.sendText
import dev.slne.surf.surfapi.core.api.service.PlayerLookupService
import net.kyori.adventure.text.format.TextColor
import java.util.UUID

class VelocityPunishService : PunishService {
    override suspend fun kickPlayer(playerUuid: UUID, reason: String) {

        val target = PlayerLookupService.getUsername(playerUuid) ?: "unknown"

        plugin.proxy.sendText {
            appendKickPrefix()
            text(target, TextColor.fromHexString("#FFAA00")!!)
            appendSpace()
            info("wurde vom Server geworfen.")
        }

        val id = IDService.generateID()

        plugin.proxy.getPlayer(playerUuid).ifPresent {
            it.disconnect(appendScreen(id, reason))
        }
    }

    override suspend fun banPlayer(playerUuid: UUID, time: Long, reason: String) {
        //TODO: Implement Database for better Bans
    }

    override suspend fun mutePlayer(playerUuid: UUID, time: Long, reason: String) {
        //TODO: Implement Database for better Mutes
    }

    override suspend fun warnPlayer(playerUuid: UUID, reason: String) {
        //TODO: Implement Database for better Warns
    }
}