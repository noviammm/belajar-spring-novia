package com.belajar.spring.belajarspring.service;


import java.util.List;

public interface BaseService<T> {
    T save(T param);

    T update(T param);

    int delete(T param);

    List<T> find();

    T findById(int id);
//
//    T findByIdJurusan(int idJurusan);
//
//    T findByIdMatakuliah(int idMatkul);
//
//    T findByIdMahasiswa(int npmMhs);
//
//    T findByIdKrs(int idKrs);
}
