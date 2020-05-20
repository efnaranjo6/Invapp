package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_interfaz_empleado.*

class InterfazEmpleado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interfaz_empleado)

        botonPanelEmple.setOnClickListener {
            val intent: Intent = Intent(this, PanelEmpleado::class.java)
            startActivity(intent)
        }
        botonCerrarSesion2.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        botonInventarioEmple.setOnClickListener {
            val intent: Intent = Intent(this, InventarioEmpleado::class.java)
            startActivity(intent)
        }
        botonPedidosEmple.setOnClickListener {
            val intent: Intent = Intent(this, PedidosEmpleado::class.java)
            startActivity(intent)
        }
    }

}
