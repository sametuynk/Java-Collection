package com.example.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {

        HashMap<Integer,String> plaka =new HashMap<>();

        plaka.put(16,"BURSA");
        plaka.put(34,"İSTANBUL");
        plaka.put(1,"ADANA");

      //  System.out.println(plaka.get(34));

        Set<Integer> anahtarlar =plaka.keySet();
        for (Integer i : anahtarlar) {
            System.out.print(plaka.get(i)+" - ");
        }

        HashMap<Integer,Ogrenci> nesneler =new HashMap<>();

        Ogrenci o1 = new Ogrenci(164,"samet");
        Ogrenci o2 = new Ogrenci(365,"berat");
        Ogrenci o3 = new Ogrenci(266,"ali");
        Ogrenci o4 = new Ogrenci(67,"engin");

        nesneler.put(o1.getOkulNo(),o1);
        nesneler.put(o2.getOkulNo(),o2);
        nesneler.put(o3.getOkulNo(),o3);
        nesneler.put(o4.getOkulNo(),o4);

        Set<Integer> okulNo = nesneler.keySet();

        for (Integer no:okulNo){
            System.out.println("*********");
            System.out.println("Öğrenci OKULNO : "+nesneler.get(no).getOkulNo());
            System.out.println("Öğrenci ADI    : "+nesneler.get(no).getIsim());

        }

    }




}
