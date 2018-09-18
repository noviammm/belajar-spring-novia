package com.belajar.spring.belajarspring.controller;

import com.belajar.spring.belajarspring.entity.Fakultas;
import com.belajar.spring.belajarspring.service.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FakultasController {
//    private final FakultasService service;
//
//    @Autowired
//    public FakultasController(FakultasService service) {
//        this.service = service;
//    }

    @Autowired
    private FakultasService service;

    @GetMapping(value = "/fakultas")
    public List<Fakultas> fakultas(){

        return service.find();
    }

    @PostMapping(value = "/fakultas")
    public String save(@RequestBody Fakultas fakultas){
        Fakultas data = service.save(fakultas);
        if (data.getId() == 0){
            return "Gagal insert data";
        }else {
            return "Insert data berhasil";
        }
    }

    @PutMapping(value = "/fakultas")
    public String update(@RequestBody Fakultas fakultas){
        Fakultas data = service.update(fakultas);
        if(data.getId() == 0){
            return "Gagal update data";
        }else {
            return "Update data berhasil";
        }
    }
}
