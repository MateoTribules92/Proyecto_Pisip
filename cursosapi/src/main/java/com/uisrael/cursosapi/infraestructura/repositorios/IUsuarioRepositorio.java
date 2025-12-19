package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.UsuarioJpa;

public interface IUsuarioRepositorio extends JpaRepository<UsuarioJpa, Integer>{

}
