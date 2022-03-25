package com.example.appinformes

import com.google.gson.annotations.SerializedName

data class Cliente(
    @SerializedName("dniCliente") var dni: String,
    @SerializedName("nombreCliente") var nombre: String,
    @SerializedName("apellidosCliente") var apellidos: String,
    @SerializedName("correoCliente") var correo: String,
    @SerializedName("telefonoCliente") var telefono: Int,
    @SerializedName("direccionCliente") var direccion: String,
    @SerializedName("inmueble") var inmueble: Inmueble
    )