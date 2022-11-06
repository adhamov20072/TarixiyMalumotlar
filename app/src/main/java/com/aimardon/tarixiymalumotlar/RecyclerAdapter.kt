package com.aimardon.tarixiymalumotlar

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.annotation.RequiresApi
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aimardon.tarixiymalumotlar.databinding.RecyclerItemBinding
import com.bumptech.glide.Glide
import org.intellij.lang.annotations.JdkConstants.TitledBorderTitlePosition

class RecyclerAdapter(val clicklistener:(ModelItem) -> Unit) : ListAdapter<ModelItem, RecyclerAdapter.MyViewHolder>(diffUtil) {

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

    @SuppressLint("SuspiciousIndentation")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.apply {
            TextView.text = item.binoNomi
                (Glide.with(holder.itemView).load(item.imageUrl).into(holder.binding.imgview))
                imgview.visibility=View.VISIBLE

        }
        holder.itemView.setOnClickListener {
            clicklistener(item)
        }
    }
}

