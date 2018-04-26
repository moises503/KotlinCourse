package com.platzi.platzistore

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * @author Moises
 */

fun Activity.toastLong(message : String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Activity.toastShort(message : String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun ViewGroup.inflate(layoutId : Int) : View {
    return LayoutInflater.from(context).inflate(layoutId, this, false)
}

