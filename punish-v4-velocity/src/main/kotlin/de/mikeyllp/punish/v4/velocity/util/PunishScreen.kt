package de.mikeyllp.punish.v4.velocity.util

import dev.slne.surf.surfapi.core.api.messages.Colors.Companion.PRIMARY
import dev.slne.surf.surfapi.core.api.messages.Colors.Companion.ERROR
import dev.slne.surf.surfapi.core.api.messages.Colors.Companion.VARIABLE_VALUE
import dev.slne.surf.surfapi.core.api.messages.adventure.appendText
import dev.slne.surf.surfapi.core.api.messages.adventure.buildText

fun appendScreen(id: String, reason: String) = buildText {
    appendText("Server", PRIMARY)
    appendNewline()
    appendText("Du wurdest vom Server gekickt!", ERROR)
    appendNewline()
    appendText(reason, VARIABLE_VALUE)
    appendNewline()
    info("PUNISHMENT-ID: $id")
}