package com.example.appinformes.ui.enviados

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.appinformes.databinding.FragmentEnviadosBinding

class EnviadosFragment : Fragment() {

    private var _binding: FragmentEnviadosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val enviadosViewModel =
            ViewModelProvider(this).get(EnviadosViewModel::class.java)

        _binding = FragmentEnviadosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textEnviados
        enviadosViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}