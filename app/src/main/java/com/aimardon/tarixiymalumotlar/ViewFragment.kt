package com.aimardon.tarixiymalumotlar

import android.annotation.SuppressLint
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
    lateinit var binding: FragmentViewBinding
    val args:ViewFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.textView.text = args.tarix
            binding.imageButton.setOnClickListener {
                findNavController().navigate(R.id.action_viewFragment_to_homeFragment)
            }
    }
}