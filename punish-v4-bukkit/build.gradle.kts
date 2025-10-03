plugins {
    id("dev.slne.surf.surfapi.gradle.paper-plugin")
}

surfPaperPluginApi {
    mainClass("de.mikeyllp.punish.v4.bukkit.BukkitMain")
    foliaSupported(true)
    generateLibraryLoader(false)

    authors.add("MikeyLLP")
}