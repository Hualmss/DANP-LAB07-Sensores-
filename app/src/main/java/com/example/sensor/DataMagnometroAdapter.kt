package com.example.sensor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class DataMagnometroAdapter:RecyclerView.Adapter<DataMagnometroAdapter.DataHolder>() {

      var data:List<Data> = ArrayList()
      lateinit var  context: Context
      fun DataMagnometroAdapter(data: List<Data>, context: Context)
      {
            this.data=data
            this.context=context
      }
      class DataHolder( view: View):RecyclerView.ViewHolder(view){
            val dataMX:TextView
            val dataMY:TextView
            val dataMZ:TextView

            init{
                  dataMX=view.findViewById(R.id.textView6)
                  dataMY=view.findViewById(R.id.textView7)
                  dataMZ=view.findViewById(R.id.textView8)
            }
      }
      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
            val layoutInflater =LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
            return DataHolder(layoutInflater)
      }

      override fun onBindViewHolder(holder: DataHolder, position: Int) {
            holder.dataMX.text=data[position].X
            holder.dataMY.text=data[position].Y
            holder.dataMZ.text=data[position].Z
      }

      override fun getItemCount()=data.size


}