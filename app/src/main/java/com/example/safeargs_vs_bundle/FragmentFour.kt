package com.example.safeargs_vs_bundle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.safeargs_vs_bundle.databinding.FragmentFourBinding


class FragmentFour : Fragment() {
    private lateinit var _binding: FragmentFourBinding
    val binding
        get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args : FragmentFourArgs by navArgs()
        val text = args.MyArg2

        val tv = binding.textView4
        tv.text = text

    }

}