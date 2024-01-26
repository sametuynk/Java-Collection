package com.example.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String>isimler=new ArrayList<>();

        isimler.add("ahmet");
        isimler.add("mehmet");
        isimler.add("ali");
        isimler.add("furkan");
        isimler.add("ece");

        System.out.println("Arama yapmak istediğiniz ismi giriniz : ");
        String isimAra=scanner.next();

        for (String i:isimler){
            if (i.equalsIgnoreCase(isimAra)){
                System.out.println("Aranan isim listede bulunmaktadır. ");
                break;
            }
        }
    }
}
