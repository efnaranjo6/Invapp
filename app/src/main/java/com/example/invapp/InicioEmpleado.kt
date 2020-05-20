package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio_empleado.*

class InicioEmpleado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_empleado)

        btnvolver.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnOlvido.setOnClickListener {
            val intent: Intent = Intent(this, OlvidoContraAdmin::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {
            val intent: Intent = Intent(this, InterfazEmpleado::class.java)
            startActivity(intent)
        }
        btnRegistro.setOnClickListener {
            val intent: Intent = Intent(this, RegistroAdmin::class.java)
            startActivity(intent)
        }
    }
}
