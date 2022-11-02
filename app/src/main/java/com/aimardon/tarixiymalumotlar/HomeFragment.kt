package com.aimardon.tarixiymalumotlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.aimardon.tarixiymalumotlar.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    var list:MutableList<ModelItem>?=null
    val recyclerAdapter by lazy { RecyclerAdapter() }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        list?.add(ModelItem("https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Registan_square2014.JPG/330px-Registan_square2014.JPG","Registon"))
        binding.recyclerView.adapter=recyclerAdapter
        recyclerAdapter.submitList(list)
        recyclerAdapter.seton(object :RecyclerAdapter.onclick{
            override fun click() {
                findNavController().navigate(R.id.action_homeFragment_to_viewFragment)
            }
        })
    }
}