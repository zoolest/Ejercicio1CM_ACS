package com.example.ejercicio1cm_acs

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi


import java.util.*



private lateinit var etNombre: EditText
private lateinit var etApellido: EditText
private lateinit var etCorreo: EditText
private lateinit var etNumCuenta: EditText
private lateinit var etFecha: EditText

class MainActivity : AppCompatActivity() {
    //private lateinit var etFecha:EditText
    //private lateinit var button: Button
    //private var Edad:Int = 0

    //private lateinit var
    private lateinit var btCalendario: Button
    var edad:Int =0
    var chYear:Int =0
    private val cDate=Date(System.currentTimeMillis())
    private var currentYear:Int =0
    private var currentMonth:Int =0
    private var currentDay:Int =0
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        etNombre = findViewById(R.id.etNombre)
        etApellido = findViewById(R.id.etApellido)
        etCorreo = findViewById(R.id.etCorreo)
        etNumCuenta = findViewById(R.id.etNumCuenta)
        etFecha = findViewById(R.id.etFecha)

        //etFecha.setOnClickListener { showDatePickerDialog() }


        val fechaHoy = Date(System.currentTimeMillis()).toString()
        val tvfechaHoy = findViewById<TextView>(R.id.tvfechaHoy)
        tvfechaHoy.text= fechaHoy.toString()
        btCalendario=findViewById(R.id.btCalendario)
        currentDate(cDate)
        datePicker(etFecha, btCalendario)

    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun currentDate(cDate: Date) {
        val formatoAActual = SimpleDateFormat("yyyy")
        val formatoMActual = SimpleDateFormat("MM")
        val formatoDActual = SimpleDateFormat("dd")

        val cYear = formatoAActual.format(cDate)
        val cMonth = formatoMActual.format(cDate)
        val cDay = formatoDActual.format(cDate)

        currentYear = Integer.parseInt(cYear)
        currentMonth = Integer.parseInt(cMonth)
        currentDay = Integer.parseInt(cDay)
    }
    /*
    fun selectDate( view: View): Int {
        val c = Calendar.getInstance()
        var cDay =c.get(Calendar.DAY_OF_MONTH)
        var cMonth = c.get(Calendar.YEAR)
        var cYear= c.get(Calendar.YEAR)
        val calendarDialog= DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            cDay=dayOfMonth
            cMonth=month
            cYear=year
            button.setOnClickListener{
                val currentYear= Calendar.getInstance().get(Calendar.YEAR)
                val Edad= currentYear-cYear
            }
            etFecha.setText(" $cDay / ${cMonth+1} / $year")

        },cYear, cMonth,cDay)

return Edad

    private fun showDatePickerDialog() {
        val datePicker= DatePickerFragment{day, month,year -> onDateSelected(day,month,year)}
        datePicker.show(supportFragmentManager,"datePicker")
    }
    fun onDateSelected(day:Int,month:Int, year:Int){
        val selectedMonth = month + 1
       val fecha= etFecha.setText(" $day / $selectedMonth / $year")
        return fecha

    }
    }*/





    fun datePicker(etFecha:TextView, btCalendario:Button) {
        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        val year = c.get(Calendar.YEAR)

        btCalendario.setOnClickListener{
            val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {
                    datePicker, year, month, day -> etFecha.text ="$day / ${month+1} / $year"
                chYear= year
                if((month+1)<currentMonth){
                    edad=(currentYear-year)
                }
                else {
                    if ((month+1) > currentMonth) {
                        edad = (currentYear - year) - 1
                    }
                    else {
                        if (day <= currentDay) {
                            edad = (currentYear - year)
                        }
                        else {
                            edad = (currentYear - year) - 1
                        }
                    }
                }
            }, year, month, day)
            datePickerDialog.show()
        }
    }



    fun clickBotonContinuar(view: android.view.View) {
        val intent= Intent(this,Activity2::class.java)
        val nombre = etNombre.text.toString()
        val apellido = etApellido.text.toString()
        val correo = etCorreo.text.toString()
        val numCuenta = Integer.parseInt(etNumCuenta.text.toString())
        val edad = Integer.parseInt(edad.toString())
        val chYear = Integer.parseInt(chYear.toString())



        //val fecha= Calendar.getInstance()



        //val fecha = Integer.parseInt(etFecha.text.toString())
        //val fecha =  Integer.parseInt(DatePickerFragment{ day, month, year -> onDateSelected(day,month,year)}.toString())
        //val fecha = onDateSelected()
        //val fechaHoy = Integer.parseInt(Date(System.currentTimeMillis()).toString())
        //val Edad = fechaHoy-onDateSelected(d)

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
        parametros.putInt("edad", edad)

        parametros.putInt("chYear", chYear)
        //parametros.putString("fecha", fecha.toString())

        intent.putExtras(parametros)

        startActivity(intent)


    }




}



