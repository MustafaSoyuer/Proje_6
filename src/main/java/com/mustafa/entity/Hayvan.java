package com.mustafa.entity;

public class Hayvan {
    String ad;
    String tur;
    String renk;
    int uzunluk;
    int agirlik;
    int yas;
    String beslenmeSekli;

    public Hayvan() {
    }
    public Hayvan(String ad, String tur, String renk, int uzunluk, int agirlik, int yas, String beslenmeSekli) {
        this.ad = ad;
        this.tur = tur;
        this.renk = renk;
        this.uzunluk = uzunluk;
        this.agirlik = agirlik;
        this.yas = yas;
        this.beslenmeSekli = beslenmeSekli;
    }
    public void yemekYe(){
        System.out.print(getClass().getSimpleName()+ " yemek yedi.");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


    public String getBeslenmeSekli() {
        return beslenmeSekli;
    }

    public void setBeslenmeSekli(String beslenmeSekli) {
        this.beslenmeSekli = beslenmeSekli;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "ad='" + ad + '\'' +
                ", tur='" + tur + '\'' +
                ", renk='" + renk + '\'' +
                ", uzunluk=" + uzunluk +
                ", agirlik=" + agirlik +
                ", yas=" + yas +
                ", beslenmeSekli='" + beslenmeSekli + '\'' +
                '}';
    }
}
