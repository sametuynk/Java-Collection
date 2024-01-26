package com.example.collections;

import androidx.annotation.Nullable;

public class Ogrenci implements Comparable<Ogrenci> {
    private int okulNo;
    private String isim;

    public Ogrenci() {
    }

    public Ogrenci(int tcno, String isim) {
        this.okulNo = tcno;
        this.isim = isim;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
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

    @Override
    public int hashCode() {
        return this.okulNo;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return this.okulNo == ((Ogrenci) obj).getOkulNo();
    }
}
