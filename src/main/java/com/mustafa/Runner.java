package com.mustafa;

import com.mustafa.entity.Balik;
import com.mustafa.entity.Kedi;
import com.mustafa.entity.Kus;
import com.mustafa.entity.Yilan;

public class Runner {
    public static void main(String[] args) {

        Kedi kedi = new Kedi("Kedi","Tekir","Gri",60,400,6,"Etobur",25);
        Balik balik = new Balik("Balık","Japon Balığı","Siyah",10,5,2,"Otobur",2);
        Kus kus = new Kus("Kuş","Kanarya","Sarı",25,10,4,"Otobur",10);
        Yilan yilan = new Yilan("Yilan","Kobra","Yeşil",500,100,15,"Etobur",true);

        System.out.println(kedi.toString());
        kedi.yemekYe();
        kedi.sesCikar();
        System.out.println();

        System.out.println(balik.toString());
        balik.yemekYe();
        balik.yuz();
        System.out.println();

        System.out.println(kus.toString());
        kus.yemekYe();
        kus.uc();
        System.out.println();

        System.out.println(yilan.toString());
        yilan.yemekYe();
        yilan.surun();



    }// main sonu
}// class sonu