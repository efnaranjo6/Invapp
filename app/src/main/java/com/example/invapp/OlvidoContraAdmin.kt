package com.example.invapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_olvido_contra_admin.*

class OlvidoContraAdmin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olvido_contra_admin)

        btnvolver.setOnClickListener {
            val intent: Intent = Intent(this, InicioAdministrador::class.java)
            startActivity(intent)
        }
    }


}
