package com.belajar.spring.belajarspring.dao;

import java.util.List;

public interface BaseDAO<T> {
    T save(T param);

    T update(T param);

    int delete(T param);

    List<T> find();

    T findById(int id);

//    T findByIdJurusan(int idJurusan);
//
//    T findByIdMatakuliah(int idMatkul);
//
//    T findByIdMahasiswa(int npmMhs);
//
//    T findByIdKrs(int idKrs);
}
