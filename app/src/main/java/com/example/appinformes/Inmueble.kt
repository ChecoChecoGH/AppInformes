package com.example.appinformes

import com.google.gson.annotations.SerializedName

data class Inmueble (
    @SerializedName("calle") var calle: String,
    @SerializedName("dniCliente") var dni: String,
    @SerializedName("tecnicoAsignado") var dniTecnico: String?,
    @SerializedName("metros") var metros: Float,
    @SerializedName("pendiente") var pendiente: EstadoInforme = EstadoInforme.PENDIENTE,
    @SerializedName("informe") var informe: Informe?
    )