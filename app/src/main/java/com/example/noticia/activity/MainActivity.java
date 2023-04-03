package com.example.noticia.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.noticia.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listaHoteis(View view){
        Intent ir = new Intent(MainActivity.this, ListagemNoticia.class);
        startActivity(ir);
    }
    public void listaHoteis2(View view){
        Intent ir = new Intent(MainActivity.this, RecyclerNoticia.class);
        startActivity(ir);
    }
}