package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.RolJpa;

public interface IRolRepositorio extends JpaRepository<RolJpa, Integer> {

}
