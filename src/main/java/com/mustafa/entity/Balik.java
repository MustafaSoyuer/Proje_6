package com.mustafa.entity;

public class Balik extends Hayvan{
    int yuzgecUzunlugu;

    public Balik(int yuzgecUzunlugu) {
        this.yuzgecUzunlugu = yuzgecUzunlugu;
    }

    public Balik(String ad, String tur, String renk, int uzunluk, int agirlik, int yas, String beslenmeSekli, int yuzgecUzunlugu) {
        super(ad, tur, renk, uzunluk, agirlik, yas, beslenmeSekli);
        this.yuzgecUzunlugu = yuzgecUzunlugu;
    }

    public void yuz(){
        System.out.println("Balık yüzüyor.");
    }

    @Override
    public String toString() {
        return "Balik{" +

                " ad='" + ad + '\'' +
                ", tur='" + tur + '\'' +
                ", renk='" + renk + '\'' +
                ", uzunluk=" + uzunluk +
                ", agirlik=" + agirlik +
                ", yas=" + yas +
                ", beslenmeSekli='" + beslenmeSekli + '\'' +
                ", yuzgecUzunlugu='" + yuzgecUzunlugu + '\'' +
                '}';
    }
}
