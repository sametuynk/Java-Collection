package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulKayitExample1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Ogrenci> ogrenciler=new ArrayList<>();

        while (true){
            System.out.println("Öğrenci okul no giriniz:");
            int no=scanner.nextInt();

            System.out.println("Öğrenci ismini giriniz");
            String isim=scanner.next();

            Ogrenci yeniOgrenci=new Ogrenci(no,isim);// Sanal nesne her seferinde sıfırlanıyor. Ama her yeni kayıtta ArrayListe eklemesini yapıyor.

            ogrenciler.add(yeniOgrenci);

            System.out.println("Çıkış 1 - Devam diğer sayılar");
            int secim=scanner.nextInt();
            if (secim==1){
                //kayıtları göster
                for (Ogrenci o : ogrenciler){
                    System.out.println("---------------");
                    System.out.println("Okul no       : "+o.getOkulNo());
                    System.out.println("Öğrenci isim  : "+o.getIsim());
                }
                break;
            }
        }

    }
}
