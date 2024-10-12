package com.example.parcialdamcuadros20100754.ui.ingreso

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.parcialdamcuadros20100754.MainActivity
import com.example.parcialdamcuadros20100754.R
import com.google.android.material.snackbar.Snackbar

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Valores de prueba para la admisión del login
        title = "Sign In"
        val test_email: String = "admin@travelapp.com"
        val test_psw: String = "admin123"

        // código para la lectura de variables y acciones

        // Declaración de elementos del diseño
        val et_email : EditText = findViewById(R.id.et_email)
        val et_psw : EditText = findViewById(R.id.et_password)
        val btn_login : Button = findViewById(R.id.btn_login)

        btn_login.setOnClickListener {
            val email: String = et_email.text.trim().toString()
            val psw: String = et_psw.text.trim().toString()

            // Comparación de variables con los valores indicados para el acceso a la aplicación
            if (email == test_email && psw == test_psw ) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            val rootView: View = findViewById(android.R.id.content)
            Snackbar.make(rootView, "Credenciales Invalidas", Snackbar.LENGTH_LONG).show()
        }
    }
}