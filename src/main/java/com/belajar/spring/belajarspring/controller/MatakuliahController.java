package com.belajar.spring.belajarspring.controller;

import com.belajar.spring.belajarspring.entity.Matakuliah;
import com.belajar.spring.belajarspring.service.MatakuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MatakuliahController {
    @Autowired
    private MatakuliahService service;

    @GetMapping(value = "/matakuliah")
    public List<Matakuliah> matakuliah(){
        return service.find();
    }

    @PostMapping(value = "/matakuliah")
    public String save(@RequestBody Matakuliah matakuliah){
        Matakuliah data = service.save(matakuliah);
        if (data.getIdMatkul() == 0){
            return "Gagal insert data";
        }else {
            return "Insert data berhasil";
        }
    }

    @PutMapping(value = "/matakuliah")
    public String update(@RequestBody Matakuliah matakuliah){
        Matakuliah data = service.update(matakuliah);
        if(data.getIdMatkul() == 0){
            return "Gagal update data";
        }else {
            return "Update data berhasil";
        }
    }


}
