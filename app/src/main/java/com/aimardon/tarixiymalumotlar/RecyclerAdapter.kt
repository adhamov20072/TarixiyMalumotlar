package com.aimardon.tarixiymalumotlar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aimardon.tarixiymalumotlar.databinding.RecyclerItemBinding
import com.bumptech.glide.Glide
import org.intellij.lang.annotations.JdkConstants.TitledBorderTitlePosition

class RecyclerAdapter : ListAdapter<ModelItem, RecyclerAdapter.MyViewHolder>(diffUtil) {
    var listener:Onclick?=null
    var A:Int?=null
    class MyViewHolder(val binding: RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ModelItem>() {

            override fun areItemsTheSame(oldItem: ModelItem, newItem: ModelItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ModelItem, newItem: ModelItem): Boolean {
                return oldItem.binoNomi == newItem.binoNomi
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
            TextView.text = item.binoNomi.toString()
            (Glide.with(holder.itemView)
                .load(item.imageUrl)
                .into(holder.binding.imgview))
            IIIitem.setOnClickListener {
                val a=onitem(position)
                A=a
                listener?.click()
            }
        }
    }

    interface Onclick {
        fun click()
    }
    fun seton (onclick: Onclick){
        listener=onclick
    }
    fun onitem(position: Int):Int{
        return position
    }
}

