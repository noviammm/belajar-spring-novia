package com.belajar.spring.belajarspring.controller;

import com.belajar.spring.belajarspring.entity.Jurusan;
import com.belajar.spring.belajarspring.service.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JurusanController {
    @Autowired
    private JurusanService service;

    @GetMapping(value = "/jurusan")
    public List<Jurusan> jurusan(){
        return service.find();
    }

    @PostMapping(value = "/jurusan")
    public String save(@RequestBody Jurusan jurusan){
        Jurusan data = service.save(jurusan);
        if (data.getId() == 0){
            return "Gagal insert data";
        }else {
            return "Insert data berhasil";
        }
    }

    @PutMapping(value = "/jurusan")
    public String update(@RequestBody Jurusan jurusan){
        Jurusan data = service.update(jurusan);
        if(data.getId() == 0){
            return "Gagal update data";
        }else {
            return "Update data berhasil";
        }
    }
}
