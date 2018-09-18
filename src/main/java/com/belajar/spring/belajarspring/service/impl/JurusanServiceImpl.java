package com.belajar.spring.belajarspring.service.impl;


import com.belajar.spring.belajarspring.dao.JurusanDAO;
import com.belajar.spring.belajarspring.entity.Jurusan;
import com.belajar.spring.belajarspring.service.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JurusanServiceImpl implements JurusanService {

    @Autowired
    public JurusanDAO jurusanDAO;

    @Override
    public Jurusan save(Jurusan param){
        return jurusanDAO.save(param);
    }

    @Override
    public Jurusan update(Jurusan param){
        return null;
    }

    @Override
    public int delete(Jurusan param){
        return 0;
    }

    @Override
    public List<Jurusan> find(){
        return jurusanDAO.find();
    }

    @Override
    public Jurusan findByIdJurusan(int idJurusan) {
        return null;
    }

    @Override
    public Jurusan findByIdFakultas(int idFakultas) {
        return null;
    }

    @Override
    public Jurusan findByIdMatakuliah(int idMatkul) {
        return null;
    }

    @Override
    public Jurusan findByIdMahasiswa(int npmMhs) {
        return null;
    }

    @Override
    public Jurusan findByIdKrs(int idKrs) {
        return null;
    }
}
