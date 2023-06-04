package com.example.safeargs_vs_bundle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.safeargs_vs_bundle.databinding.FragmentThreeBinding


class FragmentThree : Fragment() {
    private lateinit var _binding: FragmentThreeBinding
    val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText: EditText = binding.et3
        val action = FragmentThreeDirections.actionFragmentThreeToFragmentFour(editText.text.toString())

        binding.button3.setOnClickListener {
            findNavController().navigate(action)
        }

    }

}