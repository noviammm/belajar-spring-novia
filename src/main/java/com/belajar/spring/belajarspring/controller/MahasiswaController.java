package com.belajar.spring.belajarspring.controller;

import com.belajar.spring.belajarspring.entity.Mahasiswa;
import com.belajar.spring.belajarspring.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MahasiswaController {
    @Autowired
    private MahasiswaService service;

    @GetMapping(value = "/mahasiswa")
    public List<Mahasiswa> mahasiswa(){
        return service.find();
    }

    @PostMapping(value = "/mahasiswa")
    public String save(@RequestBody Mahasiswa mahasiswa){
        Mahasiswa data = service.save(mahasiswa);
        if (data.getNpmMhs() == 0){
            return "Gagal insert data";
        }else {
            return "Insert data berhasil";
        }
    }

    @PutMapping(value = "/mahasiswa")
    public String update(@RequestBody Mahasiswa jurusan){
        Mahasiswa data = service.update(jurusan);
        if(data.getNpmMhs() == 0){
            return "Gagal update data";
        }else {
            return "Update data berhasil";
        }
    }

}
