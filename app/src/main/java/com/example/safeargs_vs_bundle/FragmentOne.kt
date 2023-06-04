package com.example.safeargs_vs_bundle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.safeargs_vs_bundle.databinding.FragmentOneBinding


class FragmentOne : Fragment() {

    private lateinit var _binbind: FragmentOneBinding
    val binding
        get() = _binbind

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binbind = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val editText = binding.et1
        val bundle = Bundle()

        binding.button1.setOnClickListener {
            if (editText.text.toString().length > 0) {
                bundle.putString("MyArg", editText.text.toString())
            }
            findNavController().navigate(R.id.fragmentTwo, bundle)

        }

        binding.btnToActivity2.setOnClickListener {
            findNavController().navigate(R.id.mainActivity2)
        }


    }


}