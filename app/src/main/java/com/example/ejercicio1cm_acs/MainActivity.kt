package com.example.ejercicio1cm_acs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickBotonContinuar(view: android.view.View) {
        val intent= Intent(this,Activity2::class.java)

        val parametros = Bundle()
        parametros.putString("nombre","Usuario")
        parametros.putString("apellido","apellidoUsuario")
        parametros.putString("correo","correousuario@gmail.com")
        parametros.putInt("numCuenta",314145678)
        intent.putExtras(parametros)

        startActivity(intent)


    }


}