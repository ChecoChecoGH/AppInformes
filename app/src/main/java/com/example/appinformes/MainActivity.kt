package com.example.appinformes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        binding.botonRegistro.setOnClickListener {
            abrirRegistro()
        }
    }

    private fun abrirApp(){
        val intent = Intent(this, InformeActivity::class.java)
        startActivity(intent)
    }

    private fun abrirRegistro(){
        val intent = Intent(this, Registro::class.java)
        startActivity(intent)
    }
}