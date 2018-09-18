package com.belajar.spring.belajarspring.service.impl;

import com.belajar.spring.belajarspring.dao.MahasiswaDAO;
import com.belajar.spring.belajarspring.entity.Mahasiswa;
import com.belajar.spring.belajarspring.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    public MahasiswaDAO mahasiswaDAO;

    @Override
    public Mahasiswa save(Mahasiswa param){
        return mahasiswaDAO.save(param);
    }

    @Override
    public Mahasiswa update(Mahasiswa param){
        return null;
    }

    @Override
    public int delete(Mahasiswa param){
        return 0;
    }

    @Override
    public List<Mahasiswa> find(){
        return mahasiswaDAO.find();
    }

    @Override
    public Mahasiswa findById(int id) {
        return null;
    }


}
