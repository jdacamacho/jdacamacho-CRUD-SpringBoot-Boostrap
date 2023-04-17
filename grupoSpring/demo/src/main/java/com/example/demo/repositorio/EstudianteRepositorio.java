package com.example.demo.repositorio;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante,Long>{
    
}
