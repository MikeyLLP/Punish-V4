package de.mikeyllp.punish.v4.core.service

/**
 * IDService for generating unique IDs for punishments.
 */

object IDService {

    private const val ID_LENGTH = 8
    private val LETTERS : List<Char> = ('A'..'Z') + ('0'..'9')

    fun generateID(): String {
        return (1..ID_LENGTH)
            .map { LETTERS.random() }
            .joinToString("")
    }
}