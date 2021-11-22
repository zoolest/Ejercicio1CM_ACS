package com.example.ejercicio1cm_acs

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
        val chYearRecibido= bundle?.getInt("chYear", 0)
        val edadRecibida = bundle?.getInt("edad",0)


        val tvNombre2 = findViewById<TextView>(R.id.tvNombre2)
        val tvApellido2=findViewById<TextView>(R.id.tvApellido2)
        val tvNumCuenta2 = findViewById<TextView>(R.id.tvNumCuenta2)
        val tvCorreo2=findViewById<TextView>(R.id.tvCorreo2)

        val tvEdad2=findViewById<TextView>(R.id.tvEdad2)
        val tvHoroscopo2=findViewById<TextView>(R.id.tvHoroscopo2)

        tvNombre2.text=usuarioRecibido
        tvApellido2.text=apellidoRecibido
        tvNumCuenta2.text= numCuentaRecibido.toString()
        tvCorreo2.text=correoRecibido
        tvEdad2.text= edadRecibida.toString()
        tvHoroscopo2.text=chYearRecibido.toString()
        //Toast.makeText(this, "Nombre: $usuarioRecibido, Apellido: $apellidoRecibido, Correo: $correoRecibido, Num Cuenta: $numCuentaRecibido",Toast.LENGTH_LONG).show()

            if (chYearRecibido!!.equals("1924")||chYearRecibido.equals("1936")
                ||chYearRecibido.equals("1948")||chYearRecibido.equals("1960")
                ||chYearRecibido.equals("1972")||chYearRecibido.equals("1984")
                ||chYearRecibido.equals("1996")||chYearRecibido.equals("2008")
                ||chYearRecibido.equals("2020")){

                tvHoroscopo2.setText("RATA")
            }else if(chYearRecibido.equals("1925")||chYearRecibido.equals("1937")
                ||chYearRecibido.equals("1949")||chYearRecibido.equals("1961")
                ||chYearRecibido.equals("1973")||chYearRecibido.equals("1985")
                ||chYearRecibido.equals("1997")||chYearRecibido.equals("2009")
                ||chYearRecibido.equals("2021")){

                tvHoroscopo2.setText("BUEY")
            }else if(chYearRecibido.equals("1926")||chYearRecibido.equals("1938")
                ||chYearRecibido.equals("1950")||chYearRecibido.equals("1962")
                ||chYearRecibido.equals("1974")||chYearRecibido.equals("1986")
                ||chYearRecibido.equals("1998")||chYearRecibido.equals("2010")){

                tvHoroscopo2.setText("TIGRE")
            }else if(chYearRecibido.equals("1927")||chYearRecibido.equals("1939")
                ||chYearRecibido.equals("1951")||chYearRecibido.equals("1963")
                ||chYearRecibido.equals("1975")||chYearRecibido.equals("1987")
                ||chYearRecibido.equals("1999")||chYearRecibido.equals("2011")){

                tvHoroscopo2.setText("CONEJO")
            }else if(chYearRecibido.equals("1928")||chYearRecibido.equals("1940")
                ||chYearRecibido.equals("1952")||chYearRecibido.equals("1964")
                ||chYearRecibido.equals("1976")||chYearRecibido.equals("1988")
                ||chYearRecibido.equals("2000")||chYearRecibido.equals("2012")){

                tvHoroscopo2.setText("DRAGON")
            }else if(chYearRecibido.equals("1929")||chYearRecibido.equals("1941")
                ||chYearRecibido.equals("1953")||chYearRecibido.equals("1965")
                ||chYearRecibido.equals("1977")||chYearRecibido.equals("1989")
                ||chYearRecibido.equals("2001")||chYearRecibido.equals("2013")){

                tvHoroscopo2.setText("SERPIENTE")
            }else if(chYearRecibido.equals("1930")||chYearRecibido.equals("1942")
                ||chYearRecibido.equals("1954")||chYearRecibido.equals("1966")
                ||chYearRecibido.equals("1978")||chYearRecibido.equals("1990")
                ||chYearRecibido.equals("2002")||chYearRecibido.equals("2014")){

                tvHoroscopo2.setText("CABALLO")
            }else if(chYearRecibido.equals("1931")||chYearRecibido.equals("1943")
                ||chYearRecibido.equals("1955")||chYearRecibido.equals("1967")
                ||chYearRecibido.equals("1979")||chYearRecibido.equals("1991")
                ||chYearRecibido.equals("2003")||chYearRecibido.equals("2015")){

                tvHoroscopo2.setText("CABRA")
            }else if(chYearRecibido.equals("1932")||chYearRecibido.equals("1944")
                ||chYearRecibido.equals("1956")||chYearRecibido.equals("1968")
                ||chYearRecibido.equals("1980")||chYearRecibido.equals("1992")
                ||chYearRecibido.equals("2004")||chYearRecibido.equals("2016")){

                tvHoroscopo2.setText("MONO")
            }else if(chYearRecibido.equals("1933")||chYearRecibido.equals("1945")
                ||chYearRecibido.equals("1957")||chYearRecibido.equals("1969")
                ||chYearRecibido.equals("1981")||chYearRecibido.equals("1993")
                ||chYearRecibido.equals("2005")||chYearRecibido.equals("2017")){

                tvHoroscopo2.setText("GALLO")
            }else if(chYearRecibido.equals("1934")||chYearRecibido.equals("1946")
                ||chYearRecibido.equals("1958")||chYearRecibido.equals("1970")
                ||chYearRecibido.equals("1982")||chYearRecibido.equals("1994")
                ||chYearRecibido.equals("2006")||chYearRecibido.equals("2018")){

                tvHoroscopo2.setText("PERRO")
            }
            else if(chYearRecibido.equals("1935")||chYearRecibido.equals("1947")
                ||chYearRecibido.equals("1959")||chYearRecibido.equals("1971")
                ||chYearRecibido.equals("1983")||chYearRecibido.equals("1995")
                ||chYearRecibido.equals("2007")||chYearRecibido.equals("2019")){

                tvHoroscopo2.setText("CERDO")
            }else{
                tvHoroscopo2.setText("ERROR")
            }



    }
    fun clickBotonRegresar(view: android.view.View) {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)

    }
}