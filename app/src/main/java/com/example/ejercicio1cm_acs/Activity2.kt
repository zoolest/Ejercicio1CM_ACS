package com.example.ejercicio1cm_acs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val bundle = intent.extras
        val usuarioRecibido=bundle?.getString("nombre","")
        val apellidoRecibido=bundle?.getString("apellido","")
        val correoRecibido=bundle?.getString("correo","")
        val numCuentaRecibido=bundle?.getInt("numCuenta",0 )

        Toast.makeText(this, "Nombre: $usuarioRecibido, Apellido: $apellidoRecibido, Correo: $correoRecibido, Num Cuenta: $numCuentaRecibido",Toast.LENGTH_LONG).show()



    }
    fun clickBotonRegresar(view: android.view.View) {

        //Toast.makeText(this, "Nombre: $usuarioRecibido, Num Cuenta: $numCuentaRecibido",Toast.LENGTH_LONG).show()

        //startActivity(intent)
    }
}