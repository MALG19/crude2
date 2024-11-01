package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mascotas;
import com.example.demo.service.MascotasService;



@RestController
@RequestMapping(path="api/v1/mascotas")
public class MascotasController {

    @Autowired

    private MascotasService mascotasService;

    @GetMapping
    public List<Mascotas>getAll(){
        return mascotasService.getMascotas();
    }

    @GetMapping("/{mascotasId}")
    public Optional <Mascotas> getById(@PathVariable("mascotasId")Long mascotasId){
        return mascotasService.getMascotas(mascotasId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Mascotas mascotas){
        mascotasService.saveOrUpdate(mascotas);
    }

    @PutMapping("/{mascotasId}")
    public void update(@PathVariable("mascotasId")Long mascotasId, @RequestBody Mascotas mascotas){
        mascotas.setId(mascotasId);
        mascotasService.saveOrUpdate(mascotas);
    }

    @DeleteMapping("/{mascotasId}")
    public void saveUpdate(@PathVariable("mascotasId")Long mascotasId){
        mascotasService.delete(mascotasId);
    }

}
    


