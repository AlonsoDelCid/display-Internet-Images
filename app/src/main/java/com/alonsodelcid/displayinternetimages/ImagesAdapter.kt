package com.alonsodelcid.displayinternetimages

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item.view.*

class ImagesAdapter(val context: Context) : RecyclerView.Adapter<ImagesAdapter.ImageViewHolder>() {
    private var images: List<String> = emptyList()

    fun setImagesList(images: List<String>){
        this.images = images
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val image = images[position]

        Glide
            .with(context)
            .load(image)
            .centerCrop()
            .into(holder.itemView.imageView);

        holder.itemView.imageView.setOnClickListener {
            val intent = Intent(context, FullScreenActivity::class.java)
            intent.putExtra("image", image)
            context.startActivity(intent)
        }
    }

    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}