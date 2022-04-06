package com.example.motionlayoutdemo.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.motionlayoutdemo.R
import com.example.motionlayoutdemo.databinding.ActivityToolBarCoverBinding

class ToolBarCoverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding =
            ActivityToolBarCoverBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(viewBinding.root)
        viewBinding.recyclerView.adapter = ToolBarAdapter()
    }
}