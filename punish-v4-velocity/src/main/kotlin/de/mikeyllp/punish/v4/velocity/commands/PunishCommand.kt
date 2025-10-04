package de.mikeyllp.punish.v4.velocity.commands

import dev.jorel.commandapi.kotlindsl.commandAPICommand

fun punishCommand() = commandAPICommand("punish") {
    withPermission("punish.v4.velocity.command.punish")
    kickCommand()
}