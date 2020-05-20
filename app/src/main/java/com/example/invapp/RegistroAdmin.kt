package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_registro_admin.*

class RegistroAdmin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_admin)

        btnVolver.setOnClickListener {
            val intent:Intent = Intent(this, InicioAdministrador::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {
            val intent:Intent = Intent(this, RegistroAdmin2::class.java)
            startActivity(intent)
        }

    }
}
