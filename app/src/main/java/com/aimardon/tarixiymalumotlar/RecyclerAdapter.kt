package com.aimardon.tarixiymalumotlar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aimardon.tarixiymalumotlar.databinding.RecyclerItemBinding
import com.bumptech.glide.Glide

class RecyclerAdapter : ListAdapter<ModelItem, RecyclerAdapter.MyViewHolder>(diffUtil) {
    var listener:onclick?=null
    class MyViewHolder(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ModelItem>() {

            override fun areItemsTheSame(oldItem: ModelItem, newItem: ModelItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ModelItem, newItem: ModelItem): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            RecyclerItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.apply {
            TextView.text = item.ism
            (Glide.with(holder.itemView)
                .load(item.img)
                .into(holder.binding.imgview))
            IIIitem.setOnClickListener {
                listener?.click()
            }
        }
    }

    interface onclick {
        fun click()
    }
    fun seton (onclick: onclick){
        listener=onclick
    }
}

