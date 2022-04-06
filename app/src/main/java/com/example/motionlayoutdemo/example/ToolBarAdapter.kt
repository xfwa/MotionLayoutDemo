package com.example.motionlayoutdemo.example

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutdemo.databinding.ItemToolBarBinding

class ToolBarAdapter : RecyclerView.Adapter<ToolBarAdapter.ToolBarHolder>() {
    class ToolBarHolder(private val viewBinding: ItemToolBarBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {
        fun bindData(position: Int) {
            viewBinding.tvContent.text = position.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToolBarHolder {
        return ToolBarHolder(
            ItemToolBarBinding.inflate(
                LayoutInflater.from(parent.context),
                null,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ToolBarHolder, position: Int) {
        holder.bindData(position)
    }

    override fun getItemCount(): Int = 100
}