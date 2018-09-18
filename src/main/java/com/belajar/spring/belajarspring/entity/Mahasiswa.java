package com.belajar.spring.belajarspring.entity;

import java.io.Serializable;
import java.sql.Date;

public class Mahasiswa implements Serializable {

    private int npmMhs;

    private String namaMhs;

    private String tempatLahir;

    private Date tglLahir;

    private String alamatMhs;

    private String ayahMhs;

    private String ibuMhs;

    private int idJurusan;

    public Mahasiswa(){

    }

    public Mahasiswa(int npmMhs){
        this.npmMhs = npmMhs;
    }

    public Mahasiswa(String namaMhs, String tempatLahir,Date tglLahir,
                     String alamatMhs, String ayahMhs, String ibuMhs,
                     int idJurusan) {
        this.namaMhs = namaMhs;
        this.tempatLahir = tempatLahir;
        this.tglLahir = tglLahir;
        this.alamatMhs = alamatMhs;
        this.ayahMhs = ayahMhs;
        this.ibuMhs = ibuMhs;
        this.idJurusan = idJurusan;
    }

    public Mahasiswa(int npmMhs, String namaMhs, String tempatLahir,Date tglLahir,
                     String alamatMhs, String ayahMhs, String ibuMhs,
                     int idJurusan) {
        this.npmMhs = npmMhs;
        this.namaMhs = namaMhs;
        this.tempatLahir = tempatLahir;
        this.tglLahir = tglLahir;
        this.alamatMhs = alamatMhs;
        this.ayahMhs = ayahMhs;
        this.ibuMhs = ibuMhs;
        this.idJurusan = idJurusan;
    }

    public int getNpmMhs() {
        return npmMhs;
    }

    public void setNpmMhs(int npmMhs) {
        this.npmMhs = npmMhs;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getAlamatMhs() {
        return alamatMhs;
    }

    public void setAlamatMhs(String alamatMhs) {
        this.alamatMhs = alamatMhs;
    }

    public String getAyahMhs() {
        return ayahMhs;
    }

    public void setAyahMhs(String ayahMhs) {
        this.ayahMhs = ayahMhs;
    }

    public String getIbuMhs() {
        return ibuMhs;
    }

    public void setIbuMhs(String ibuMhs) {
        this.ibuMhs = ibuMhs;
    }

    public int getIdJurusan() {
        return idJurusan;
    }

    public void setIdJurusan(int idJurusan) {
        this.idJurusan = idJurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "npmMhs=" + npmMhs +
                ", namaMhs='" + namaMhs + '\'' +
                ", tempatLahir='" + tempatLahir + '\'' +
                ", tglLahir='" + tglLahir + '\'' +
                ", alamatMhs='" + alamatMhs + '\'' +
                ", ayahMhs='" + ayahMhs + '\'' +
                ", ibuMhs='" + ibuMhs + '\'' +
                ", idJurusan='" + idJurusan + '\'' +
                '}';
    }
}
