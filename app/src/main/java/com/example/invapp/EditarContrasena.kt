package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_editar_contrasena.*

class EditarContrasena : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_contrasena)

        botonConfirmar.setOnClickListener {
            val intent: Intent = Intent(this, ContraExitoso::class.java)
            startActivity(intent)
        }
    }
}
