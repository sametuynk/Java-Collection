package com.example.collections;

import java.util.HashSet;

public class HashSetNesneMain {
    public static void main(String[] args) {

        HashSet<Ogrenci> nesneler =new HashSet<>();


        Ogrenci o1 = new Ogrenci(164,"samet");
        Ogrenci o2 = new Ogrenci(365,"berat");
        Ogrenci o3 = new Ogrenci(266,"ali");
        Ogrenci o4 = new Ogrenci(67,"engin");

        nesneler.add(o1);
        nesneler.add(o2);
        nesneler.add(o3);
        nesneler.add(o4);

        Ogrenci o5=new Ogrenci(67,"Alperen");
        nesneler.add(o5);

        for (Ogrenci o:nesneler) {
            System.out.println("*********");
            System.out.println("Öğrenci TCNO : "+o.getOkulNo());
            System.out.println("Öğrenci ADI  : "+o.getIsim());
        }
    }
}
