package com.museodelasculturasdeoaxaca.kotlinjava

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * Created by moises on 15/03/18.
 */

class MainActivity : AppCompatActivity() {
    lateinit var password: EditText // Without init but init after
    lateinit var username: EditText
    lateinit var btnSignin: Button

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById<View>(R.id.edtUser) as EditText
        password = findViewById<View>(R.id.edtPassword) as EditText
        btnSignin = findViewById<View>(R.id.btnSignin) as Button

        val sharedPreferences = getSharedPreferences("kotlinprefs", Context.MODE_PRIVATE)

        val isLogged = sharedPreferences.getBoolean("loggedin", false)

        if(isLogged){
            startActivity(Intent(this@MainActivity, ListActivity::class.java))
            finish()
        }

        btnSignin.setOnClickListener {
                val isValid = password.isValidPassword()
                Log.e(TAG, "onClick:" + isValid)
                if (isValid) {
                    // startActivity(Intent(this@MainActivity, ListActivity::class.java))
                    val intent = Intent(this@MainActivity, ListActivity::class.java)
                    intent.putExtra("user", username.text.toString())
                    startActivity(intent)
                    sharedPreferences.edit {
                        putBoolean("loggedin", true)
                    }
                } else {
                    Toast.makeText(this@MainActivity, "Password inválida", Toast.LENGTH_LONG).show()
                }
            }
        }
}


