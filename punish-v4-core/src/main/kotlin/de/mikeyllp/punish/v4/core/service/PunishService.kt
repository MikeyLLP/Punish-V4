package de.mikeyllp.punish.v4.core.service

import java.util.UUID

/**
* Service Interface for managing the punishments in the system.
*/
interface PunishService {
    fun kickPlayer(playerUuid: UUID, reason: String)

    fun banPlayer(playerUuid: UUID, time: Long, reason: String)

    fun mutePlayer(playerUuid: UUID, time: Long, reason: String)

    fun warnPlayer(playerUuid: UUID, reason: String)
}