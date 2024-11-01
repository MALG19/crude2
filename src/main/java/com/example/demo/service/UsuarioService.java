package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public  List<usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }

    public  Optional<usuario> getUsuarios(Long id){
        return usuarioRepository.findById(id);
    }

    public void saveOrUpdate(usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void delete (long id){
        usuarioRepository.deleteById(id);
    }


}
