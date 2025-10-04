package de.mikeyllp.punish.v4.bukkit.service

import de.mikeyllp.punish.v4.core.service.PunishService
import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import java.util.UUID

class BukkitPunishService : PunishService {
    override fun kickPlayer(playerUuid: UUID, reason: String) {
        Bukkit.getPlayer(playerUuid)?.kick(Component.text(reason))
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