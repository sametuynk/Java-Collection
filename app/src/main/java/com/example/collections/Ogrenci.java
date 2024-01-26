package com.example.collections;

public class Ogrenci implements Comparable<Ogrenci> {
    private int tcno;
    private String isim;

    public Ogrenci() {
    }

    public Ogrenci(int tcno, String isim) {
        this.tcno = tcno;
        this.isim = isim;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public int compareTo(Ogrenci ogrenci) {
        return new String(this.isim).compareTo(ogrenci.getIsim());
    }
}
