package de.mikeyllp.punish.v4.bukkit.utils

import dev.slne.surf.surfapi.bukkit.api.permission.PermissionRegistry

object PunishPermissionRegistry : PermissionRegistry() {

    private const val PREFIX = "punish.4.bukkit"
    private const val COMMAND_PREFIX = "$PREFIX.command"

    val COMMAND_PUNISH = create("$COMMAND_PREFIX.punish")
    val COMMAND_BAN = create("$COMMAND_PREFIX.ban")
    val COMMAND_MUTE = create("$COMMAND_PREFIX.mute")
    val COMMAND_KICK = create("$COMMAND_PREFIX.kick")

    val COMMAND_UNBAN = create("$COMMAND_PREFIX.unban")
    val COMMAND_UNMUTE = create("$COMMAND_PREFIX.unmute")
}