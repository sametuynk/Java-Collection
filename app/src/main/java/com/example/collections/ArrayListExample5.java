package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        ArrayList<Personel>personels=new ArrayList<>(); //ARRAYLİST DÖNGÜ DIŞINDA OLURSA SIFIRLANMAZ.

        for (int i = 0; i < 3; i++) {

            System.out.println((i+1)+".Personel isim :");
            String isim=scanner.next();

            System.out.println((i+1)+".Personel adres il :");
            String il=scanner.next();

            System.out.println((i+1)+".Personel adres ilce :");
            String ilce=scanner.next();

            Adres yeniAdres = new Adres(il,ilce);

            Personel yeniPersonel =new Personel(i+1,isim,yeniAdres);

            personels.add(yeniPersonel);

        }

        for (Personel p:personels){
            System.out.println("---------------------------");
            System.out.println("Personel No   :"+p.getPersonelNo());
            System.out.println("Personel İsim :"+p.getIsim());
            System.out.println("---ADRES---");
            System.out.println("Personel İl   :"+p.getAdres().getIl());
            System.out.println("Personel İlçe :"+p.getAdres().getIlce());
        }
    }
}
