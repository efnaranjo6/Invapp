package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_registro_admin2.*

class RegistroAdmin2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_admin2)
        btnTerminar.setOnClickListener {
            val intent: Intent = Intent(this, RegistroExitoso::class.java)
            startActivity(intent)
        }
    }
}
