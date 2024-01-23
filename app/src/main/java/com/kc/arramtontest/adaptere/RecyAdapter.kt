package com.kc.arramtontest.adaptere

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.kc.arramtontest.R
import com.kc.arramtontest.model.modelData

class RecyAdapter(var context : Context, var mody : modelData) :
    RecyclerView.Adapter<RecyAdapter.RecyViewHolder>() {

    class RecyViewHolder(itemView: View) : ViewHolder(itemView){
        var aman=itemView.findViewById<TextView>(R.id.tv_name)
        var numb=itemView.findViewById<TextView>(R.id.tv_number)
        var date=itemView.findViewById<TextView>(R.id.tv_date)
        var tools_name=itemView.findViewById<TextView>(R.id.tv_tools_name)
        var tools_number=itemView.findViewById<TextView>(R.id.tv_tools_number)
        var recived=itemView.findViewById<TextView>(R.id.tv_recieved)
        var staTus=itemView.findViewById<TextView>(R.id.tv_status)
        var front_Image=itemView.findViewById<ImageView>(R.id.im_front)
        var back_Image=itemView.findViewById<ImageView>(R.id.im_back)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyViewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.layout_card_view,parent,false)
        return RecyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mody.data.size
    }

    override fun onBindViewHolder(holder: RecyViewHolder, position: Int) {

        val itData = mody.data
        holder.aman.text=itData[position].borrower.name
        holder.numb.text= itData[position].borrower.mobileNo.toString()
        holder.tools_name.text= itData[position].tool.name
        holder.tools_number.text= itData[position].toolId.toString()
        holder.recived.text= itData[position].isReceived.toString()
        holder.date.text= itData[position].receivedDate.toString()
        holder.staTus.text="Status"
        Glide.with(context)
            .load(itData[position].tool.frontImage)
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_background)
            .sizeMultiplier(0.9f)
            .into(holder.front_Image)
        Glide.with(context)
            .load(itData[position].tool.backImage)
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_background)
            .sizeMultiplier(0.9f)
            .into(holder.back_Image)
    }
}