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

import com.example.demo.entity.Servicios;
import com.example.demo.service.ServiciosService;



@RestController
@RequestMapping(path="api/v1/servicios")
public class ServiciosController {

    @Autowired
    private ServiciosService serviciosService;

    @GetMapping
    public List<Servicios> getAll(){
        return serviciosService.getServicios();
    }
    
    @GetMapping("/{servicioId}")
    public Optional <Servicios> getById(@PathVariable("servicioId") Long servicioId) {
        return serviciosService.getServicios(servicioId);
    }
    
    @PostMapping
    public void saveUpdate(@RequestBody Servicios servicios){
        serviciosService.saveOrUpdate(servicios);
    }

    @PutMapping("/{servicioId}")
    public void Update(@PathVariable("servicioId") Long serviciosId, @RequestBody Servicios servicios){
        servicios.setId(serviciosId);
        serviciosService.saveOrUpdate(servicios);
    }

    @DeleteMapping("/{servicioId}")
    public void saveUpdate(@PathVariable("servicioId") Long servicioId){
        serviciosService.delete(servicioId);
    }
}
