package com.example.safeargs_vs_bundle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.safeargs_vs_bundle.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    private lateinit var _binding: FragmentTwoBinding
    val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTwoBinding.inflate(inflater, container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fromBundle = arguments?.getString("MyArg") // обращаемся к bundle через его getter arguments
        val textView = binding.tv2
        textView.text = fromBundle   // TextView через биндинг

        binding.button2.setOnClickListener { findNavController().navigate(R.id.fragmentThree) }

    }
}