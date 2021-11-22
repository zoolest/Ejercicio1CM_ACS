package com.example.ejercicio1cm_acs

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat


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
        val fechaHoy = Date(System.currentTimeMillis()).toString()
        val tvfechaHoy = findViewById<TextView>(R.id.tvfechaHoy)
        tvfechaHoy.text= fechaHoy.toString()


    }



    private fun showDatePickerDialog() {
        val datePicker= DatePickerFragment{day, month,year -> onDateSelected(day,month,year)}
        datePicker.show(supportFragmentManager,"datePicker")
    }
    fun onDateSelected(day:Int,month:Int, year:Int){
        val selectedMonth = month + 1
        etFecha.setText(" $day / $selectedMonth / $year")

    }



    fun clickBotonContinuar(view: android.view.View) {
        val intent= Intent(this,Activity2::class.java)
        val nombre = etNombre.text.toString()
        val apellido = etApellido.text.toString()
        val correo = etCorreo.text.toString()
        val numCuenta = Integer.parseInt(etNumCuenta.text.toString())

        //val fecha = Integer.parseInt(etFecha.text.toString())
        //val fecha =  Integer.parseInt(DatePickerFragment{ day, month, year -> onDateSelected(day,month,year)}.toString())
        //val fecha = onDateSelected()
        //val fechaHoy = Integer.parseInt(Date(System.currentTimeMillis()).toString())
        //val Edad = fechaHoy-fecha

        val parametros = Bundle()
        parametros.putString("nombre",nombre)
        //parametros.putString("nombre","Usuario")
        parametros.putString("apellido",apellido)
        //parametros.putString("apellido","apellidoUsuario")
        parametros.putString("correo",correo)
        //parametros.putString("correo","correousuario@gmail.com")
        parametros.putInt("numCuenta",numCuenta)
        //parametros.putInt("numCuenta",314145678)
        //parametros.putInt("fecha", fecha)
        //parametros.putInt("Edad", Edad)
        //parametros.putString("fecha", fecha.toString())

        intent.putExtras(parametros)

        startActivity(intent)


    }




}



