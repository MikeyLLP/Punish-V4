package de.mikeyllp.punish.v4.bukkit.service

import de.mikeyllp.punish.v4.bukkit.utils.appendKickPrefix
import de.mikeyllp.punish.v4.core.service.PunishService
import dev.slne.surf.surfapi.bukkit.api.extensions.server
import dev.slne.surf.surfapi.core.api.messages.adventure.sendText
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import org.bukkit.Bukkit
import java.util.UUID

class BukkitPunishService : PunishService {
    override suspend fun kickPlayer(playerUuid: UUID, reason: String) {
        val player = Bukkit.getPlayer(playerUuid)
        val offlinePlayer = Bukkit.getOfflinePlayer(playerUuid)

        player?.kick(Component.text(reason))

        server.sendText {
            appendKickPrefix()
            text(offlinePlayer.name.toString(), TextColor.fromHexString("#FFAA00")!!)
            appendSpace()
            info("wurde vom Server geworfen.")
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