package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.UsuarioRolJpa;

public interface IUsuarioRolRepositorio extends JpaRepository<UsuarioRolJpa, Integer>{

}
