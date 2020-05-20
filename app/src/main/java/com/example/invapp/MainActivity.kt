package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonAdministrador.setOnClickListener {
            val intent:Intent = Intent(this, InicioAdministrador::class.java)
            startActivity(intent)
        }
        botonEmpleado.setOnClickListener {
            val intent:Intent = Intent(this, InicioEmpleado::class.java)
            startActivity(intent)
        }

    }
}
