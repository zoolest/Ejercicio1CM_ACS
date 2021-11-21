package com.example.ejercicio1cm_acs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import java.util.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val bundle = intent.extras
        val usuarioRecibido = bundle?.getString("nombre", "")
        val apellidoRecibido = bundle?.getString("apellido", "")
        val correoRecibido = bundle?.getString("correo", "")
        val numCuentaRecibido = bundle?.getInt("numCuenta", 0)
        //val fechaRecibida = bundle?.getInt("fecha", 0)
        val fechaRecibida = bundle?.getInt("fecha",0)
        //val fechaHoy = Date(System.currentTimeMillis())



        //val fechaRecibida = bundle?.getInt("fechaHoy",0)

        //Toast.makeText(this,"Text  $fechaHoy",Toast.LENGTH_LONG)

        val tvNombre2 = findViewById<TextView>(R.id.tvNombre2)
        val tvApellido2=findViewById<TextView>(R.id.tvApellido2)
        val tvNumCuenta2 = findViewById<TextView>(R.id.tvNumCuenta2)
        val tvCorreo2=findViewById<TextView>(R.id.tvCorreo2)

        val tvEdad2=findViewById<TextView>(R.id.tvEdad2)

        tvNombre2.text=usuarioRecibido
        tvApellido2.text=apellidoRecibido
        tvNumCuenta2.text= numCuentaRecibido.toString()
        tvCorreo2.text=correoRecibido

        tvEdad2.text= fechaRecibida.toString()

        //Toast.makeText(this,"Text  $fechaHoy",Toast.LENGTH_LONG)
        //Toast.makeText(this, "Nombre: $usuarioRecibido, Apellido: $apellidoRecibido, Correo: $correoRecibido, Num Cuenta: $numCuentaRecibido",Toast.LENGTH_LONG).show()



    }
    fun clickBotonRegresar(view: android.view.View) {

        //Toast.makeText(this, "Nombre: $usuarioRecibido, Num Cuenta: $numCuentaRecibido",Toast.LENGTH_LONG).show()

        //startActivity(intent)
    }
}