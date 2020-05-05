package com.mercadolibre.android.andesui.tag.size

/**
 * Utility class that does two things: Defines the possible sizes an [AndesTag] can take because it's an enum, as you can see.
 * But as a bonus it gives you the proper implementation so you don't have to make any mapping.
 *
 * You ask me with, let's say 'SMALL', and then I'll give you a proper implementation of that size.
 *
 * @property size Possible sizes that an [AndesTag] may take.
 */
enum class AndesSimpleTagSize {
    SMALL,
    LARGE;

    companion object {
        fun fromString(value: String): AndesSimpleTagSize = valueOf(value.toUpperCase())
    }

    internal val size get() = getAndesSimpleTagSize()

    private fun getAndesSimpleTagSize(): AndesSimpleTagSizeInterface {
        return when (this) {
            SMALL -> AndesSmallSimpleTagSize()
            LARGE -> AndesLargeSimpleTagSize()
        }
    }
}
