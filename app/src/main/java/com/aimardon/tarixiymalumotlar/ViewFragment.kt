package com.aimardon.tarixiymalumotlar

import android.icu.text.Transliterator.Position
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.aimardon.tarixiymalumotlar.databinding.FragmentViewBinding


class ViewFragment : Fragment() {
 lateinit var binding:FragmentViewBinding
 val args:ViewFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentViewBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tarixiyMalumot=args.tarix
        binding.textView.text= tarixiyMalumot.toString()
        binding.imageButton.setOnClickListener {
            findNavController().navigate(R.id.action_viewFragment_to_homeFragment)
        }
    }
}