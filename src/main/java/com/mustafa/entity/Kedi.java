package com.mustafa.entity;

public class Kedi extends Hayvan {
    int kuyrukUzunlugu;

    public Kedi(int kuyrukUzunlugu) {
        this.kuyrukUzunlugu = kuyrukUzunlugu;
    }

    public Kedi(String ad, String tur, String renk, int uzunluk, int agirlik, int yas, String beslenmeSekli, int kuyrukUzunlugu) {
        super(ad, tur, renk, uzunluk, agirlik, yas, beslenmeSekli);
        this.kuyrukUzunlugu = kuyrukUzunlugu;
    }
    public void sesCikar(){
        System.out.println("Kedi miyavlıyor.");
    }

    @Override
    public String toString() {
        return "Kedi{" +
                " ad='" + ad + '\'' +
                ", tur='" + tur + '\'' +
                ", renk='" + renk + '\'' +
                ", uzunluk=" + uzunluk +
                ", agirlik=" + agirlik +
                ", yas=" + yas +
                ", beslenmeSekli='" + beslenmeSekli + '\'' +
                ", kuyrukUzunlugu=" + kuyrukUzunlugu +
                '}';
    }
}
