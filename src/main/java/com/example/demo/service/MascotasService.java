package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mascotas;
import com.example.demo.repository.MascotasRepository;

@Service
public class MascotasService {

    @Autowired
    MascotasRepository mascotasRepository;

    public List<Mascotas> getMascotas(){
        return mascotasRepository.findAll();
    }

    public Optional<Mascotas> getMascotas(Long id){
        return mascotasRepository.findById(id);
    }

    public void saveOrUpdate(Mascotas mascotas){
        mascotasRepository.save(mascotas);
    }

    public void delete (Long id){
        mascotasRepository.deleteById(id);
    }
}