package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListExample2 {
    public static void main(String[] args) {
        //ÖRNEK-1
        // 0 İLE 100 ARASINDA RASTGELE SAYILAR ÜRETEREK ARRAYLİST İÇERİSİNE AKTARINIZ VE KÜÇÜKTEN BÜYÜĞE DOĞRU SIRALAYINIZ.

        ArrayList<Integer> sayilar=new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int rastgeleSayi=random.nextInt(101);
            sayilar.add(rastgeleSayi);
        }
        Collections.sort(sayilar);

        for (Integer i:sayilar) {
            System.out.print(i+" - ");
        }


    }
}
