package de.mikeyllp.punish.v4.bukkit.commands

import de.mikeyllp.punish.v4.bukkit.utils.PunishPermissionRegistry
import dev.jorel.commandapi.kotlindsl.commandAPICommand

fun punishCommand() = commandAPICommand("punish") {
    withPermission(PunishPermissionRegistry.COMMAND_PUNISH)
    kickCommand()
}