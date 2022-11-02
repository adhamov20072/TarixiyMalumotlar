package com.aimardon.tarixiymalumotlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aimardon.tarixiymalumotlar.databinding.FragmentHomeBinding
import com.aimardon.tarixiymalumotlar.databinding.FragmentViewBinding


class ViewFragment : Fragment() {
 lateinit var binding:FragmentViewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentViewBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.imageButton.setOnClickListener {
            findNavController().navigate(R.id.action_viewFragment_to_homeFragment)
        }
    }
}