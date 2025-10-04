package de.mikeyllp.punish.v4.bukkit

import com.github.shynixn.mccoroutine.folia.SuspendingJavaPlugin
import de.mikeyllp.punish.v4.bukkit.commands.punishCommand
import de.mikeyllp.punish.v4.bukkit.service.BukkitPunishService
import de.mikeyllp.punish.v4.core.service.CoreService
import org.bukkit.plugin.java.JavaPlugin

val plugin get() = JavaPlugin.getPlugin(BukkitMain::class.java)

class BukkitMain : SuspendingJavaPlugin() {

    override fun onEnable() {
        CoreService.punishService = BukkitPunishService()

        punishCommand()
    }

    override fun onDisable() {
        // Stop logic
    }
}