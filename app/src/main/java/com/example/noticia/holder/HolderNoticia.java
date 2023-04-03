package com.example.noticia.holder;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noticia.R;

public class HolderNoticia extends RecyclerView.ViewHolder {

    public TextView nome;
    public TextView local;
    public TextView valor;
    public ImageView capa;

    public HolderNoticia(@NonNull View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.txtNomeHotel);
        local = itemView.findViewById(R.id.txtLocal);
        valor = itemView.findViewById(R.id.txtValor);
        capa = itemView.findViewById(R.id.imgCapa);


    }
}

