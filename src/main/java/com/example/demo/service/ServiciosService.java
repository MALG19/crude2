package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Servicios;
import com.example.demo.repository.ServiciosRepository;

@Service
public class ServiciosService {

    @Autowired
    ServiciosRepository serviciosRepository;

    public List <Servicios> getServicios(){
        return  serviciosRepository.findAll();
    }

    public Optional<Servicios> getServicios(Long id){
        return  serviciosRepository.findById(id);
    }

    public void saveOrUpdate(Servicios servicios){
        serviciosRepository.save(servicios);
    }

    
    public void delete(Long id){
        serviciosRepository.deleteById(id);
    }
}
