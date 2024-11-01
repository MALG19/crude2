package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mascotas;

@Repository
public interface  MascotasRepository extends JpaRepository<Mascotas, Long>{

}
