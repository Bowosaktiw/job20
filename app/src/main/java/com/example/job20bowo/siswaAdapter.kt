package com.example.job20bowo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class siswaAdapter(private val list:ArrayList<Siswa>): RecyclerView.Adapter<siswaAdapter.SiswaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiswaViewHolder {
        return SiswaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }

    override fun onBindViewHolder(holder: SiswaViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class SiswaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.textnama)
        private val nis = itemView.findViewById<TextView>(R.id.textnis)

        fun bind(get: Siswa) {
            nama.text = get.nama
            nis.text = get.nis

        }
    }
}