plugins {
    id("dev.slne.surf.surfapi.gradle.velocity")
}

velocityPluginFile {
    id = "punish-v4-velocity"
    main = "de.mikeyllp.punish.v4.velocity.VelocityMain"
    name = "Punish-V4-Velocity"
    authors = listOf("MikeyLLP")
    version = "${project.version}"
}

dependencies {
    api(project(":punish-v4-core"))
}