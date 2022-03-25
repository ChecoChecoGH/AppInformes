package com.example.appinformes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appinformes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonLogin.setOnClickListener{
            abrirApp()
        }
        binding.botonRegistroTecnico.setOnClickListener {
            abrirRegistroTecnico()
        }
        binding.botonRegistroCliente.setOnClickListener {
            abrirRegistroCliente()
        }
    }

    private fun abrirApp(){
        val intent = Intent(this, InformeActivity::class.java)
        startActivity(intent)
    }

    private fun abrirRegistroTecnico(){
        val intent = Intent(this, RegistroTecnico::class.java)
        startActivity(intent)
    }

    private fun abrirRegistroCliente() {
        val intent = Intent(this, RegistroCliente::class.java)
        startActivity(intent)
    }
}