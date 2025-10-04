package de.mikeyllp.punish.v4.bukkit.commands

import de.mikeyllp.punish.v4.bukkit.utils.PunishPermissionRegistry
import de.mikeyllp.punish.v4.core.service.CoreService.Companion.punishService
import dev.jorel.commandapi.CommandAPICommand
import dev.jorel.commandapi.kotlindsl.anyExecutor
import dev.jorel.commandapi.kotlindsl.getValue
import dev.jorel.commandapi.kotlindsl.greedyStringArgument
import dev.jorel.commandapi.kotlindsl.playerArgument
import dev.jorel.commandapi.kotlindsl.subcommand
import org.bukkit.entity.Player

fun CommandAPICommand.kickCommand() = subcommand("kick") {
    withPermission(PunishPermissionRegistry.COMMAND_KICK)
    playerArgument("target")
    greedyStringArgument("reason")

    anyExecutor { sender, args ->
        val target: Player by args
        val reason: String by args

        punishService.kickPlayer(target.uniqueId, reason)
    }
}