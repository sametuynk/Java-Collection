package com.example.collections;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> meyveler=new ArrayList<>();

        meyveler.add("Elma");
        meyveler.add("muz");
        meyveler.add("portakal");

        System.out.println("Boyut :"+meyveler.size());

        System.out.println();

        System.out.println(meyveler.get(2));
        meyveler.add("Armut");
        meyveler.add("Kiraz");

        meyveler.remove(3); //3.indexdeki veriyi siler.

        meyveler.add(3,"Şeftali"); //3.index'e şeftali ekleme yapan method. Bir nevi araya yerleştirme görevi görür.
        meyveler.add(3,"Vişne");

        meyveler.set(2,"Avakado");

        System.out.println(meyveler.get(3 ));
        for (String m:meyveler) {
            System.out.print(m+" - ");
        }
    }
}
