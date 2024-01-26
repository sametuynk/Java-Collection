package com.example.collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListExample4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Integer>tahminler=new ArrayList<>();

        Random uret=new Random();

        int sayi=uret.nextInt(101);


        for (int i = 0; i < 5; i++) {
            System.out.print("\n"+(i+1)+".Tahmininizi giriniz:");
            int tahmin=scanner.nextInt();
            tahminler.add(tahmin);
            if (tahmin==sayi){
                System.out.println("Tebrikler Doğru Tahmin Yaptınız :)");
                break;
            }
            if (tahmin<sayi){
                System.out.println("Yukarı");
            }
            if (tahmin>sayi){
                System.out.println("Aşağı");
            }
        }
        System.out.println("-------------------------------");
        System.out.print("Üretilen sayi : "+sayi);
        System.out.println("\nTahminler  ");

        for (Integer i:tahminler){
            System.out.print(i+"  ");
        }

    }
}
