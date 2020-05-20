package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_panel_administrador.*

class PanelAdministrador : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel_administrador)

        botonVolver.setOnClickListener {
            val intent: Intent = Intent(this, InterfazAdmin::class.java)
            startActivity(intent)
        }
        botonEditarContra.setOnClickListener {
            val intent: Intent = Intent(this, EditarContrasena::class.java)
            startActivity(intent)
        }
        botonEditarCod.setOnClickListener {
            val intent: Intent = Intent(this, EditarCodigo::class.java)
            startActivity(intent)
        }
    }
}
