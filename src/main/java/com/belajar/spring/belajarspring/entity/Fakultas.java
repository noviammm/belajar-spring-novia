package com.belajar.spring.belajarspring.entity;

import java.io.Serializable;


public class Fakultas implements Serializable{

    private int id;

    private String nama;

    public Fakultas(){

    }

    public Fakultas(int id){
        this.id = id;
    }

    public Fakultas(String nama){
        this.nama = nama;
    }

    public Fakultas(int id, String nama){
        this.id = id;
        this.nama = nama;
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

    @Override
    public String toString() {
        return "Fakultas{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                '}';
    }
}
