package com.belajar.spring.belajarspring.entity;

public class Matakuliah {

    private int idMatkul;
    private String namaMatkul;
    private int sksMatkul;

    public Matakuliah(){

    }

    public Matakuliah(int idMatkul){
        this.idMatkul = idMatkul;
    }

    public Matakuliah(String namaMatkul, int sksMatkul){
        this.namaMatkul = namaMatkul;
        this.sksMatkul = sksMatkul;
    }

    public Matakuliah(int idMatkul, String namaMatkul, int sksMatkul){
        this.idMatkul = idMatkul;
        this.namaMatkul = namaMatkul;
        this.sksMatkul = sksMatkul;
    }

    public int getIdMatkul() {
        return idMatkul;
    }

    public void setIdMatkul(int idMatkul) {
        this.idMatkul = idMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getSksMatkul() {
        return sksMatkul;
    }

    public void setSksMatkul(int sksMatkul) {
        this.sksMatkul = sksMatkul;
    }

    @Override
    public String toString() {
        return "Matakuliah{" +
                "idMatkul=" + idMatkul +
                ", namaMatkul='" + namaMatkul + '\'' +
                ", sksMatkul='" + sksMatkul + '\'' +
                '}';
    }
}
