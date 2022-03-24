package com.example.appinformes.ui.pendientes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.appinformes.databinding.FragmentEnviadosBinding
import com.example.appinformes.databinding.FragmentPendientesBinding

class PendientesFragment : Fragment() {

    private var _binding: FragmentPendientesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val pendientesViewModel =
            ViewModelProvider(this).get(PendientesViewModel::class.java)

        _binding = FragmentPendientesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPendientes
        pendientesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}