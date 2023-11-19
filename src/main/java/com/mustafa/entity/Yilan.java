package com.mustafa.entity;

public class Yilan extends Hayvan{
    boolean zehirliMi;

    public Yilan(boolean zehirliMi) {
        this.zehirliMi = zehirliMi;
    }

    public Yilan(String ad, String tur, String renk, int uzunluk, int agirlik, int yas, String beslenmeSekli, boolean zehirliMi) {
        super(ad, tur, renk, uzunluk, agirlik, yas, beslenmeSekli);
        this.zehirliMi = zehirliMi;
    }

    public void surun(){
        System.out.println("Yılan sürünüyor.");
    }

    @Override
    public String toString() {
        return "Yilan{" +
                " ad='" + ad + '\'' +
                ", tur='" + tur + '\'' +
                ", renk='" + renk + '\'' +
                ", uzunluk=" + uzunluk +
                ", agirlik=" + agirlik +
                ", yas=" + yas +
                ", beslenmeSekli='" + beslenmeSekli + '\'' +
                ", zehirliMi=" + zehirliMi +
                '}';
    }
}
