package com.example.kotlinphotos.ui.common

import androidx.recyclerview.widget.DiffUtil
import com.example.kotlinphotos.model.Photo


class PhotosDiffCallback : DiffUtil.ItemCallback<Photo>() {
    override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean {
        return oldItem.tittle == newItem.tittle
    }

    override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean {
        return oldItem == newItem
    }
}