package com.museodelasculturasdeoaxaca.kotlinjava

import android.content.SharedPreferences

/**
 * Created by moises on 18/03/18.
 */

fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit){
    val editor = edit()
    editor.func()
    editor.apply()
}