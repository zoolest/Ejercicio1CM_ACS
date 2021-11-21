package com.example.ejercicio1cm_acs

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.util.*


private lateinit var etNombre: EditText
private lateinit var etApellido: EditText
private lateinit var etCorreo: EditText
private lateinit var etNumCuenta: EditText
private lateinit var etFecha: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        etNombre = findViewById(R.id.etNombre)
        etApellido = findViewById(R.id.etApellido)
        etCorreo = findViewById(R.id.etCorreo)
        etNumCuenta = findViewById(R.id.etNumCuenta)
        etFecha = findViewById(R.id.etFecha)
        etFecha.setOnClickListener { showDatePickerDialog() }

    }

    private fun showDatePickerDialog() {
        val datePicker= DatePickerFragment{day, month,year -> onDateSelected(day,month,year)}
        datePicker.show(supportFragmentManager,"datePicker")

    }
    fun onDateSelected(day:Int,month:Int, year:Int){
        etFecha.setText(" $day / $month / $year")
    }

    fun clickBotonContinuar(view: android.view.View) {
        val intent= Intent(this,Activity2::class.java)

        val nombre = etNombre.text.toString()
        val apellido = etApellido.text.toString()
        val correo = etCorreo.text.toString()
        val numCuenta = Integer.parseInt(etNumCuenta.text.toString())
        //val fecha = Integer.parseInt(etFecha.text.toString())

        val parametros = Bundle()
        parametros.putString("nombre",nombre)
        //parametros.putString("nombre","Usuario")
        parametros.putString("apellido",apellido)
        //parametros.putString("apellido","apellidoUsuario")
        parametros.putString("correo",correo)
        //parametros.putString("correo","correousuario@gmail.com")
        parametros.putInt("numCuenta",numCuenta)
        //parametros.putInt("numCuenta",314145678)
        //parametros.putInt("fecha",fecha)

        intent.putExtras(parametros)

        startActivity(intent)


    }




}