package com.example.noticia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.noticia.R;

public class ListagemNoticia extends AppCompatActivity {
    private ListView listLocais;
    private String[] itens = {
            "Emirates Palace, Abu Dhabi",
            "The Mark, New York City",
            "Laucala Island Resort, Fiji",
            "The Plaza, New York City",
            "Hotel President Wilson, Geneva",
            "Burj Al Arab, Dubai",
            "The Ritz Carlton, Tokyo",
            "The Plaza, New York City",
            "Hotel President Wilson, Geneva",
            "Burj Al Arab, Dubai",
            "The Ritz Carlton, Tokyo",
            "Waldorf Astoria Beverly Hills, Los Angeles",
            "The Connaught, London",
            "The Peninsula, Paris",
            "Mandarin Oriental, Bangkok",
            "The St. Regis, Bali",
            "The Ritz, Paris",
            "The Plaza, New York City",
            "Hotel President Wilson, Geneva",
            "Burj Al Arab, Dubai",
            "The Ritz Carlton, Tokyo",
            "Waldorf Astoria Beverly Hills, Los Angeles",
            "The Connaught, London",
            "The Peninsula, Paris",
            "Mandarin Oriental, Bangkok",
            "The St. Regis, Bali",
            "The Ritz, Paris",
            "Waldorf Astoria Beverly Hills, Los Angeles",
            "The Connaught, London",
            "The Peninsula, Paris",
            "Mandarin Oriental, Bangkok",
            "The St. Regis, Bali",
            "The Ritz, Paris",
            "The Plaza, New York City",
            "Hotel President Wilson, Geneva",
            "Burj Al Arab, Dubai",
            "The Ritz Carlton, Tokyo",
            "Waldorf Astoria Beverly Hills, Los Angeles",
            "The Connaught, London",
            "The Peninsula, Paris",
            "Mandarin Oriental, Bangkok",
            "The St. Regis, Bali",
            "The Ritz, Paris",
            "The Plaza, New York City",
            "Hotel President Wilson, Geneva",
            "Burj Al Arab, Dubai",
            "The Ritz Carlton, Tokyo",
            "Waldorf Astoria Beverly Hills, Los Angeles",
            "The Connaught, London",
            "The Peninsula, Paris",
            "Mandarin Oriental, Bangkok",
            "The St. Regis, Bali",
            "The Ritz, Paris",
            "The Plaza, New York City",
            "Hotel President Wilson, Geneva",
            "Burj Al Arab, Dubai",
            "The Ritz Carlton, Tokyo",
            "Waldorf Astoria Beverly Hills, Los Angeles",
            "The Connaught, London",
            "The Peninsula, Paris",
            "Mandarin Oriental, Bangkok",
            "The St. Regis, Bali",
            "The Ritz, Paris",
            "The Plaza, New York City",
            "Hotel President Wilson, Geneva",
            "Burj Al Arab, Dubai",
            "The Ritz Carlton, Tokyo",
            "Waldorf Astoria Beverly Hills, Los Angeles",
            "The Connaught, London",
            "The Peninsula, Paris",
            "Mandarin Oriental, Bangkok",
            "The St. Regis, Bali",
            "The Ritz, Paris",
            "Rosewood Mayakoba, Mexico",
            "Four Seasons, Bora Bora",
            "Park Hyatt, Sydney",
            "The Ritz Carlton, Hong Kong",
            "The Dorchester, London",
            "The Royal Mansour, Marrakech",
            "The Balmoral, Edinburgh"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_noticia);
        listLocais = findViewById(R.id.listLocais);

        //Criando adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,itens);
        //Adicionando adaptador para a lista
        listLocais.setAdapter(adaptador);

        //Adicionando clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListagemNoticia.this, listLocais.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}