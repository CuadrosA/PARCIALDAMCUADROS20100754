package com.example.parcialdamcuadros20100754.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.parcialdamcuadros20100754.R
import com.example.parcialdamcuadros20100754.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val et_costo_vuelo: EditText = view.findViewById(R.id.et_costo_vuelo)
        val et_costo_alojamiento: EditText = view.findViewById(R.id.et_costo_alojamiento)
        val et_cantidad_noches: EditText = view.findViewById(R.id.et_cantidad_noches)
        val et_costo_comida: EditText = view.findViewById(R.id.et_costo_comida)
        val chk_agreement: CheckBox = view.findViewById(R.id.chk_agreement)
        val btn_calcular_costo: Button = view.findViewById(R.id.btn_calcular_costo)
        val tv_resultado: TextView = view.findViewById(R.id.tv_resultado)

        btn_calcular_costo.setOnClickListener{
            val costo_vuelo = et_costo_vuelo.text.toString().toDoubleOrNull()?: 0.0
            val costo_alojamiento = et_costo_alojamiento.text.toString().toDoubleOrNull()?: 0.0
            val cantidad_noches = et_cantidad_noches.text.toString().toDoubleOrNull()?: 0.0
            val costo_comida = et_costo_comida.text.toString().toDoubleOrNull()?: 0.0
            val agreement = chk_agreement.isChecked

            if (agreement){
                val result = costo_vuelo + (costo_alojamiento * cantidad_noches) + (costo_comida * cantidad_noches)
                tv_resultado.text = "$result USD"
            } else {
                tv_resultado.text = "Acepte los terminos para continuar"
            }
        }


        return view
    }
}