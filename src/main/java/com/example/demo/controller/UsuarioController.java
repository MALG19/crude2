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

import com.example.demo.entity.usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping(path ="api/v1/usuarios")
public class UsuarioController {

    @Autowired

    private UsuarioService usuarioService;
    
    @GetMapping
    public List<usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/{usuarioId}")
    public Optional<usuario> getById(@PathVariable("usuarioId") Long usuarioId){
        return usuarioService.getUsuarios(usuarioId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody usuario usuario){
        usuarioService.saveOrUpdate(usuario);
    }

    @PutMapping("/{usuarioId}")
    public void update(@PathVariable("usuarioId")long usuarioId, @RequestBody usuario usuario) {
        usuario.setId(usuarioId);
        usuarioService.saveOrUpdate(usuario);
    }


    @DeleteMapping("/{usuarioId}")
    public void saveUpdate(@PathVariable ("usuarioId")Long usuarioId){
        usuarioService.delete(usuarioId);
    }
}
