package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListNesneMain {
    public static void main(String[] args) {


        List<Ogrenci>nesneler = new ArrayList<>();

        Ogrenci o1 = new Ogrenci(164,"samet");
        Ogrenci o2 = new Ogrenci(365,"berat");
        Ogrenci o3 = new Ogrenci(266,"ali");
        Ogrenci o4 = new Ogrenci(67,"engin");

        nesneler.add(o1);
        nesneler.add(o2);
        nesneler.add(o3);
        nesneler.add(o4);

        Collections.sort(nesneler);

        for (Ogrenci o:nesneler) {
            System.out.println("*********");
            System.out.println("Öğrenci TCNO : "+o.getTcno());
            System.out.println("Öğrenci ADI  : "+o.getIsim());

        }

    }
}
