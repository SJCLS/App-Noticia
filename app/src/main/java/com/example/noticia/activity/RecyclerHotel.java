package com.example.noticia.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.noticia.R;
import com.example.noticia.adapter.AdapterHotel;
import com.example.noticia.dataset.DatasetHotel;
import com.example.noticia.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class RecyclerHotel extends AppCompatActivity {
    private RecyclerView recycler;
    private AdapterHotel adapterNoticia;
    private List<Hotel> hotelList = new ArrayList<Hotel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_hotel);
        recycler = findViewById(R.id.recyclerView);

        //Listagem de hoteis
        hotelList = DatasetHotel.getLista();

        //Configurando adapter
        adapterNoticia = new AdapterHotel(hotelList);
        //adapterNoticia = new AdapterNoticia(DatasetHotel.getLista());recycler.setAdapter(adapterNoticia);

        //Configurando recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        /*RecyclerView.LayoutManager layoutManager1 = new GridLayoutManager(getApplicationContext(),2);*/

        recycler.setLayoutManager(layoutManager);
        recycler.setHasFixedSize(true);
        recycler.setAdapter(adapterNoticia);

    }
}