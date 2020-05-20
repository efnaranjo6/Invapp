package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_editar_codigo.*

class EditarCodigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_codigo)
        botonConfirmar2.setOnClickListener {
            val intent: Intent = Intent(this, CodigoExitoso::class.java)
            startActivity(intent)
        }
    }
}
