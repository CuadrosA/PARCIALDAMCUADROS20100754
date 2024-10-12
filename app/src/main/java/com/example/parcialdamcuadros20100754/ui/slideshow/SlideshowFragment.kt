package com.example.parcialdamcuadros20100754.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialdamcuadros20100754.R
import com.example.parcialdamcuadros20100754.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_slideshow, container, false)
        // Estableciendo la creación del layout por item
        val rvPlayer: RecyclerView = view.findViewById(R.id.rvHoteles)
        rvPlayer.layoutManager = LinearLayoutManager(requireContext())
        rvPlayer.adapter = HotelAdapter(getPlayers())

        return view
    }

    private fun getPlayers(): List<HotelModel> {
        val lista_players: ArrayList<HotelModel> = ArrayList()

        lista_players.add(HotelModel(R.drawable.img1, "2000", "Cristiano Ronaldo", "10", ""))
        lista_players.add(HotelModel(R.drawable.img1, "2001", "Messi", "10", ""))
        lista_players.add(HotelModel(R.drawable.img1, "2002", "Neymar", "11", ""))
        lista_players.add(HotelModel(R.drawable.img1, "2003", "Salah", "12", ""))
        lista_players.add(HotelModel(R.drawable.img1, "2004", "Vinicius", "13", ""))

        return lista_players
    }

}