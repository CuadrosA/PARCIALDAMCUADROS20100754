package com.example.parcialdamcuadros20100754.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.parcialdamcuadros20100754.R
import com.example.parcialdamcuadros20100754.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false )

        var arrAseguradoras = arrayOf("GloberGuard Insurance", "SafeJourney Coverage", "TravelShield Protection", "VoyageSecure", "WanderSure Travel Insurance")

        var lista_aseguradoras: ListView = view.findViewById(R.id.lsAseguradoras)

        val adaptador = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, arrAseguradoras)

        lista_aseguradoras.adapter = adaptador

        lista_aseguradoras.setOnItemClickListener{
            parent, view, position, id -> Toast.makeText(requireContext(), "Posición: $position", Toast.LENGTH_SHORT)
        }
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}