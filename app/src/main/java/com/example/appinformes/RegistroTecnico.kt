package com.example.appinformes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.appinformes.databinding.ActivityRegistroTecnicoBinding
import com.google.android.material.snackbar.Snackbar

class RegistroTecnico : AppCompatActivity() {
    private lateinit var binding: ActivityRegistroTecnicoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroTecnicoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonRegistrarse.setOnClickListener{
            val auxContrasena1 = binding.etContrasena1.editText?.text
            val auxContrasena2 = binding.etContrasena2.editText?.text

            val noVacios = !binding.etNombre.editText?.text.isNullOrEmpty() &&
                    !binding.etApellidos.editText?.text.isNullOrEmpty() &&
                    !binding.etDniCifNif.editText?.text.isNullOrEmpty() &&
                    !binding.etColegio.editText?.text.isNullOrEmpty() &&
                    !binding.etNumeroColegiado.editText?.text.isNullOrEmpty() &&
                    !binding.etApellidos.editText?.text.isNullOrEmpty() &&
                    !binding.etCorreo.editText?.text.isNullOrEmpty() &&
                    !binding.etTelefono.editText?.text.isNullOrEmpty() &&
                    !auxContrasena1.isNullOrEmpty() &&
                    !auxContrasena2.isNullOrEmpty()

            if (noVacios){
                if(auxContrasena1.contentEquals(auxContrasena2)){
                    //TODO Crear usuario en la bbdd

                    Snackbar.make(binding.registroLayout, "Usuario creado satisfactoriamente", Snackbar.LENGTH_LONG).show()


                    val handler = Handler(Looper.getMainLooper())
                    handler.postDelayed({
                        // do something after 2000ms
                           finish()
                    }, 2000)

                }else{
                    Snackbar.make(binding.registroLayout, "Las contraseñas no coinciden, vuelva a intentarlo", Snackbar.LENGTH_LONG).show()
                }
            }else{
                Snackbar.make(binding.registroLayout, "No puede haber campos vacíos", Snackbar.LENGTH_LONG).show()
            }
        }
    }


}