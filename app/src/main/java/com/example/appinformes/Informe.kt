package com.example.appinformes

import com.google.gson.annotations.SerializedName
import java.util.Date
import kotlin.collections.ArrayList

/*
Informe:
-Nombre calle (id)
-Pendiente/realizada/finalizada
-DNI técnico asignado
-Array de las opciones seleccionadas(aún hay que ver las opciones)
-Fecha de envío
 */

data class Informe (
    @SerializedName("calle") var calle: String,
    @SerializedName("idTecnico") var dni: String,
    @SerializedName("detallesInforme") var detalles: ArrayList<Detalles>,
    @SerializedName("fechaEnvio") var fechaEnvio: Date
    ){
    override fun toString(): String {
        return calle
    }
}
