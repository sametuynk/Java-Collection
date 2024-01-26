package com.example.collections;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {

        //ELEMANLAR LİSTEYE BELİRLİ BİR DÜZEN İÇERİSİNDE EKLEMNMEMEKTEDİR. RASTGELE YERLEŞTİRİLMEKTEDİR.
        //AYNI ANDA AYNI TÜRDEN BİRDEN FAZLA VARSA VERİYİ KAYDETMEMEKTEDİR.

        HashSet<String> meyveler=new HashSet<>();

        meyveler.add("Elma");
        meyveler.add("Armut");
        meyveler.add("Erik");
        meyveler.add("Kiraz");

        meyveler.remove("Armut");
        meyveler.add("Kiraz");
        for (String m :meyveler) {
            System.out.print(m+" - ");
        }

    }
}
