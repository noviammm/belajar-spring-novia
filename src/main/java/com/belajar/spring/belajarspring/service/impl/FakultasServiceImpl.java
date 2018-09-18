package com.belajar.spring.belajarspring.service.impl;

import com.belajar.spring.belajarspring.dao.FakultasDAO;
import com.belajar.spring.belajarspring.entity.Fakultas;
import com.belajar.spring.belajarspring.service.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FakultasServiceImpl implements FakultasService {

    @Autowired
    public FakultasDAO fakultasDAO;

    @Override
    public Fakultas save(Fakultas param){
        return fakultasDAO.save(param);
    }

    @Override
    public Fakultas update(Fakultas param) {
        return fakultasDAO.update(param);
    }

    @Override
    public int delete(Fakultas param) {
        return 0;
    }

    @Override
    public List<Fakultas> find() {
        return fakultasDAO.find();
    }

    @Override
    public Fakultas findById(int id) {
        return null;
    }

//    @Override
//    public Fakultas findByIdJurusan(int idJurusan) {
//        return null;
//    }
//
//    @Override
//    public Fakultas findByIdMatakuliah(int idMatkul) {
//        return null;
//    }
//
//    @Override
//    public Fakultas findByIdMahasiswa(int npmMhs) {
//        return null;
//    }
//
//    @Override
//    public Fakultas findByIdKrs(int idKrs) {
//        return null;
//    }
}
