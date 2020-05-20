package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_panel_empleado.*

class PanelEmpleado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel_empleado)

        botonVolver4.setOnClickListener {
            val intent: Intent = Intent(this, InterfazEmpleado::class.java)
            startActivity(intent)
        }
        botonEditarContra2.setOnClickListener {
            val intent: Intent = Intent(this, EditarContrasena::class.java)
            startActivity(intent)
        }
    }
}
