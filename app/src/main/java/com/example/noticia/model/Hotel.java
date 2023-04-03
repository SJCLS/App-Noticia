package com.example.noticia.model;

import android.graphics.Bitmap;

public class Hotel {
    private String nomeHotel;
    private String localHotel;
    private Double valorHotel;
    private int capaHotel;

    public Hotel() {
    }

    public Hotel(String nomeHotel, String localHotel, Double valorHotel, int capaHotel) {
        this.nomeHotel = nomeHotel;
        this.localHotel = localHotel;
        this.valorHotel = valorHotel;
        this.capaHotel = capaHotel;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public String getLocalHotel() {
        return localHotel;
    }

    public void setLocalHotel(String localHotel) {
        this.localHotel = localHotel;
    }

    public Double getValorHotel() {
        return valorHotel;
    }

    public void setValorHotel(Double valorHotel) {
        this.valorHotel = valorHotel;
    }

    public int getCapaHotel() {
        return capaHotel;
    }

    public void setCapaHotel(int capaHotel) {
        this.capaHotel = capaHotel;
    }
}
