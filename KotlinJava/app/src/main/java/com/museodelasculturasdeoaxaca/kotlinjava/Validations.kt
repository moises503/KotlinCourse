package com.museodelasculturasdeoaxaca.kotlinjava

import android.widget.EditText

/**
 * Created by moises on 15/03/18.
 */


fun EditText.isValidPassword() : Boolean{
    return this.text.toString().isNotEmpty() &&
                this.text.toString().length.compareTo(6) == 1
}
