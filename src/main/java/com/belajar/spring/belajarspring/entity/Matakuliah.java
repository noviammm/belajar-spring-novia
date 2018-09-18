package com.belajar.spring.belajarspring.entity;

public class Matakuliah {

    private int id;
    private String nama;
    private int sks;

    public Matakuliah(){

    }

    public Matakuliah(int id){
        this.id = id;
    }

    public Matakuliah(String nama, int sks){
        this.nama = nama;
        this.sks = sks;
    }

    public Matakuliah(int id, String nama, int sks){
        this.id = id;
        this.nama = nama;
        this.sks = sks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    @Override
    public String toString() {
        return "Matakuliah{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", sks='" + sks + '\'' +
                '}';
    }
}
