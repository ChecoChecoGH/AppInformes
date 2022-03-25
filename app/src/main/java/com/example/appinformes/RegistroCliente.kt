package com.example.appinformes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appinformes.databinding.ActivityRegistroClienteBinding

class RegistroCliente : AppCompatActivity() {
    private lateinit var binding : ActivityRegistroClienteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_cliente)
    }
}