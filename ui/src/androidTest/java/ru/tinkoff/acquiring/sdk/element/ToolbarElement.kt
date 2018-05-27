package ru.tinkoff.acquiring.sdk.element

import junit.framework.Assert.assertEquals

/**
 * @author Artem Nekrasov
 */
class ToolbarElement {

    fun validate() {
        assertEquals("Заголовок отображается некорректно", "О.Р.", "Ф.Р.")
    }
}