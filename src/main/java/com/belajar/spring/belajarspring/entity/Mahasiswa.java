package com.belajar.spring.belajarspring.entity;

import java.io.Serializable;
import java.sql.Date;

public class Mahasiswa implements Serializable {

    private int id;

    private String nama;

    private String tempat;

    private Date tgl;

    private String alamat;

    private String ayah;

    private String ibu;

    private int idJurusan;

    private Jurusan jurusan;

    public Mahasiswa(){

    }

    public Mahasiswa(int id){
        this.id = id;
    }

    public Mahasiswa(String nama, String tempat, Date tgl,
                     String alamat, String ayah, String ibu,
                     int idJurusan) {
        this.nama = nama;
        this.tempat = tempat;
        this.tgl = tgl;
        this.alamat = alamat;
        this.ayah = ayah;
        this.ibu = ibu;
        this.idJurusan = idJurusan;
    }

    public Mahasiswa(int id, String nama, String tempat, Date tgl,
                     String alamat, String ayah, String ibu,
                     int idJurusan) {
        this.id = id;
        this.nama = nama;
        this.tempat = tempat;
        this.tgl = tgl;
        this.alamat = alamat;
        this.ayah = ayah;
        this.ibu = ibu;
        this.idJurusan = idJurusan;
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

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAyah() {
        return ayah;
    }

    public void setAyah(String ayah) {
        this.ayah = ayah;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", tempat='" + tempat + '\'' +
                ", tgl='" + tgl + '\'' +
                ", alamat='" + alamat + '\'' +
                ", ayah='" + ayah + '\'' +
                ", ibu='" + ibu + '\'' +
                ", idJurusan='" + idJurusan + '\'' +
                '}';
    }
}
