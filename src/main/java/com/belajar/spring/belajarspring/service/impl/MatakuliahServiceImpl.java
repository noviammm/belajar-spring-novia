package com.belajar.spring.belajarspring.service.impl;

import com.belajar.spring.belajarspring.dao.MatakuliahDAO;
import com.belajar.spring.belajarspring.entity.Matakuliah;
import com.belajar.spring.belajarspring.service.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatakuliahServiceImpl implements MatakuliahService {

    @Autowired
    public MatakuliahDAO matakuliahDAO;

    @Override
    public Matakuliah save(Matakuliah param){
        return matakuliahDAO.save(param);
    }

    @Override
    public Matakuliah update(Matakuliah param){
        return null;
    }

    @Override
    public int delete(Matakuliah param){
        return 0;
    }

    @Override
    public List<Matakuliah> find(){
        return matakuliahDAO.find();
    }

    @Override
    public Matakuliah findByIdJurusan(int idJurusan) {
        return null;
    }

    @Override
    public Matakuliah findByIdFakultas(int idFakultas) {
        return null;
    }

    @Override
    public Matakuliah findByIdMatakuliah(int idMatkul) {
        return null;
    }

    @Override
    public Matakuliah findByIdMahasiswa(int npmMhs) {
        return null;
    }

    @Override
    public Matakuliah findByIdKrs(int idKrs) {
        return null;
    }
}
