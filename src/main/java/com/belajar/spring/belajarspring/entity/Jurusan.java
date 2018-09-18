package com.belajar.spring.belajarspring.entity;

import java.io.Serializable;

public class Jurusan implements Serializable {

    private int id;

    private int idFakultas;

    private String nama;

    private Fakultas fakultas; //panggil objek fakultas buat join tabel karena butuh

    public Jurusan(){
    }

    public Jurusan(int id, int idFakultas){
        this.id = id;
        this.idFakultas=idFakultas;
    }

    public Jurusan(int id, int idFakultas, String nama){
        this.id = id;
        this.idFakultas=idFakultas;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(int idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //nambah jugaa
    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }
    //sampe sini

    @Override
    public String toString() {
        return "Jurusan{" +
                "id=" + id +
                "idFakultas=" + idFakultas + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}
