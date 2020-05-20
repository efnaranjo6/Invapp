package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_interfaz_admin.*

class InterfazAdmin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interfaz_admin)


        botonPanelAdmin.setOnClickListener {
            val intent: Intent = Intent(this, PanelAdministrador::class.java)
            startActivity(intent)
        }
        botonCerrarSesion.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        botonInventario.setOnClickListener {
            val intent: Intent = Intent(this, Inventario::class.java)
            startActivity(intent)
        }
        botonEmpleados.setOnClickListener {
            val intent: Intent = Intent(this, Empleados::class.java)
            startActivity(intent)
        }
        botonPedidos.setOnClickListener {
            val intent: Intent = Intent(this, Pedidos::class.java)
            startActivity(intent)
        }
        botonProveedores.setOnClickListener {
            val intent: Intent = Intent(this, Proveedores::class.java)
            startActivity(intent)
        }



    }
}
