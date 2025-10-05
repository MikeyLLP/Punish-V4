package de.mikeyllp.punish.v4.bukkit.utils

import dev.slne.surf.surfapi.core.api.messages.builder.SurfComponentBuilder
import net.kyori.adventure.text.format.TextColor

fun SurfComponentBuilder.appendCustomPrefix() {
    text("Punish", TextColor.fromHexString("#ee3d51")!!)
    appendSpace()
    darkSpacer(">>")
    appendSpace()
}

fun SurfComponentBuilder.appendBanPrefix() {
    text("Ban", TextColor.fromHexString("#ee3d51")!!)
    appendSpace()
    darkSpacer(">>")
    appendSpace()
}

fun SurfComponentBuilder.appendKickPrefix() {
    text("Kick", TextColor.fromHexString("#ee3d51")!!)
    appendSpace()
    darkSpacer(">>")
    appendSpace()
}

fun SurfComponentBuilder.appendMutePrefix() {
    text("Mute", TextColor.fromHexString("#ee3d51")!!)
    appendSpace()
    darkSpacer(">>")
    appendSpace()
}

fun SurfComponentBuilder.appendWarnPrefix() {
    text("Warn", TextColor.fromHexString("#ee3d51")!!)
    appendSpace()
    darkSpacer(">>")
    appendSpace()
}
