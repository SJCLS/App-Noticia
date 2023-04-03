package com.example.noticia.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.noticia.R;
import com.example.noticia.holder.HolderNoticia;
import com.example.noticia.model.Hotel;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterNoticia extends RecyclerView.Adapter<HolderNoticia> {

    private List<Hotel> listaHoteis;

    public AdapterNoticia(List<Hotel> hotel) {
        this.listaHoteis = hotel;
    }

    @NonNull
    @Override
    public HolderNoticia onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HolderNoticia(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.adapter_noticia, parent,
                                false));
    }

    @Override
    public void onBindViewHolder(@NonNull HolderNoticia holder, int position) {
        Hotel hotel = listaHoteis.get(position);
        holder.nome.setText(hotel.getNomeHotel());
        holder.local.setText(hotel.getLocalHotel());
        holder.valor.setText(hotel.getValorHotel().toString());
        holder.capa.setImageResource(hotel.getCapaHotel());
    }

    @Override
    public int getItemCount() {
        return listaHoteis == null ? 0 : listaHoteis.size();
    }

}



