package de.mikeyllp.punish.v4.core.service

import java.util.UUID

/**
* Service Interface for managing the punishments in the system.
*/
interface PunishService {
    suspend fun kickPlayer(playerUuid: UUID, reason: String)

    suspend fun banPlayer(playerUuid: UUID, time: Long, reason: String)

    suspend fun mutePlayer(playerUuid: UUID, time: Long, reason: String)

    suspend fun warnPlayer(playerUuid: UUID, reason: String)
}