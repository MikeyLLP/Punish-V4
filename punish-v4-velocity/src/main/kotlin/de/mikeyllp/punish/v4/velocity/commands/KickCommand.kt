package de.mikeyllp.punish.v4.velocity.commands

import com.velocitypowered.api.proxy.Player
import de.mikeyllp.punish.v4.core.service.CoreService.Companion.punishService
import de.mikeyllp.punish.v4.velocity.commands.arguments.playerArgument
import dev.jorel.commandapi.CommandAPICommand
import dev.jorel.commandapi.kotlindsl.anyExecutor
import dev.jorel.commandapi.kotlindsl.getValue
import dev.jorel.commandapi.kotlindsl.greedyStringArgument
import dev.jorel.commandapi.kotlindsl.subcommand
import kotlinx.coroutines.*


@OptIn(DelicateCoroutinesApi::class)
fun CommandAPICommand.kickCommand() = subcommand("kick") {
    withPermission("kick.v4.velocity.command.kick")
    playerArgument("target")
    greedyStringArgument("reason")

    anyExecutor { sender, args ->
        val target: Player by args
        val reason: String by args

        GlobalScope.launch {
            punishService.kickPlayer(target.uniqueId, reason)
        }
    }
}