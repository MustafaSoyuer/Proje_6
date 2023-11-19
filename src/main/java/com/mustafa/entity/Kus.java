package com.mustafa.entity;

public class Kus extends Hayvan{
    int kanatUzunlugu;

    public Kus(int kanatUzunlugu) {
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public Kus(String ad, String tur, String renk, int uzunluk, int agirlik, int yas, String beslenmeSekli, int kanatUzunlugu) {
        super(ad, tur, renk, uzunluk, agirlik, yas, beslenmeSekli);
        this.kanatUzunlugu = kanatUzunlugu;
    }

    public void uc(){
        System.out.println("Kuş uçuyor.");
    }

    @Override
    public String toString() {
        return "Kus{" +

                " ad='" + ad + '\'' +
                ", tur='" + tur + '\'' +
                ", renk='" + renk + '\'' +
                ", uzunluk=" + uzunluk +
                ", agirlik=" + agirlik +
                ", yas=" + yas +
                ", beslenmeSekli='" + beslenmeSekli + '\'' +
                ", kanatUzunlugu=" + kanatUzunlugu +
                '}';
    }
}
