package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.AuditoriaJpa;

public interface IAuditoriaRepositorio extends JpaRepository<AuditoriaJpa, Integer> {

}
