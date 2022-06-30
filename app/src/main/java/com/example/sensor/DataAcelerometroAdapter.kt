package com.example.sensor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class DataAcelerometroAdapter:RecyclerView.Adapter<DataAcelerometroAdapter.DataHolder>() {

      var data:List<Data> = ArrayList()
      lateinit var  context: Context
      fun DataAcelerometroAdapter(data: List<Data>, context: Context)
      {
            this.data=data
            this.context=context
      }
      class DataHolder( view: View):RecyclerView.ViewHolder(view){
            val dataAX:TextView
            val dataAY:TextView
            val dataAZ:TextView

            init{
                  dataAX=view.findViewById(R.id.textView2)
                  dataAY=view.findViewById(R.id.textView3)
                  dataAZ=view.findViewById(R.id.textView4)
            }
      }
      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
            val layoutInflater =LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
            return DataHolder(layoutInflater)
      }

      override fun onBindViewHolder(holder: DataHolder, position: Int) {
            holder.dataAX.text=data[position].X
            holder.dataAY.text=data[position].Y
            holder.dataAZ.text=data[position].Z


      }

      override fun getItemCount()=data.size


}