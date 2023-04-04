package com.example.noticia.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.request.RequestOptions;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.example.noticia.R;
import com.example.noticia.holder.HolderHotel;
import com.example.noticia.model.Hotel;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterHotel extends RecyclerView.Adapter<HolderHotel> {

    private List<Hotel> listaHoteis;

    public AdapterHotel(List<Hotel> hotel ) {
        this.listaHoteis = hotel;
    }

    @NonNull
    @Override
    public HolderHotel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HolderHotel(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_hotel, parent,
                                false));
    }

    @Override
    public void onBindViewHolder(@NonNull HolderHotel holder, int position) {
        Hotel hotel = listaHoteis.get(position);
        //Hotel hotel = DatasetHotel.getLista().get(position);
        holder.nome.setText(hotel.getNomeHotel());
        holder.local.setText(hotel.getLocalHotel());
        holder.valor.setText(hotel.getValorHotel().toString());
       // holder.capa.setImageResource(hotel.getCapaHotel());

        // Usando o Glide para carregar e exibir a imagem
        RequestOptions requestOptions = new RequestOptions();
        requestOptions = requestOptions.transforms(new CenterCrop(), new RoundedCorners(16));
        Glide.with(holder.itemView.getContext())
                .load(hotel.getCapaHotel())
                .apply(requestOptions)
                .into(holder.capa);

    }

    @Override
    public int getItemCount() {
        return listaHoteis == null ? 0 : listaHoteis.size();
    }

}



