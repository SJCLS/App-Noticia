package com.example.noticia.dataset;

import com.example.noticia.R;
import com.example.noticia.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class DatasetHotel {
    private static List<Hotel> lista;

    public static List<Hotel> getLista() {
        lista = new ArrayList<>();
        lista.add(new Hotel("Emirates Palace", "Abu Dhabi", 800.00, R.drawable.img));
        lista.add(new Hotel("The Mark", "Nova York", 1200.00, R.drawable.img_1));
        lista.add(new Hotel("Laucala Island Resort", "Fiji", 1500.00, R.drawable.img_2));
        lista.add(new Hotel("The Plaza", "Nova York", 900.00, R.drawable.img_3));
        lista.add(new Hotel("Hotel President Wilson", "Genebra", 1000.00, R.drawable.img_4));
        lista.add(new Hotel("Burj Al Arab", "Dubai", 1200.00, R.drawable.img_5));
        lista.add(new Hotel("The Ritz Carlton", "Tóquio", 1100.00, R.drawable.img_6));
        lista.add(new Hotel("Waldorf Astoria Beverly Hills", "Los Angeles", 1000.00, R.drawable.img_7));
        lista.add(new Hotel("The Connaught", "Londres", 800.00, R.drawable.img_8));
        lista.add(new Hotel("The Peninsula", "Paris", 1200.00, R.drawable.img_9));
        lista.add(new Hotel("Mandarin Oriental", "Bangkok", 900.00, R.drawable.img_10));
        lista.add(new Hotel("The St. Regis", "Bali", 800.00, R.drawable.img_11));
        lista.add(new Hotel("The Ritz", "Paris", 1000.00, R.drawable.img_12));
        lista.add(new Hotel("Rosewood Mayakoba", "Playa del Carmen", 1000.00, R.drawable.img_13));
        lista.add(new Hotel("Four Seasons", "Bora Bora", 1500.00, R.drawable.img_14));
        lista.add(new Hotel("Park Hyatt", "Sydney", 1100.00, R.drawable.img_15));
        lista.add(new Hotel("The Ritz Carlton", "Hong Kong", 1200.00, R.drawable.img_16));
        lista.add(new Hotel("The Dorchester", "Londres", 900.00, R.drawable.img_17));
        lista.add(new Hotel("The Royal Mansour", "Marrakech", 1000.00, R.drawable.img_18));
        lista.add(new Hotel("The Balmoral", "Edimburgo", 2265.00, R.drawable.img_19));
        return lista;
    }


    public static void addPessoa(Hotel hotel) {
        lista.add(hotel);
    }
}


