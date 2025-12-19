package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.DispositivoJpa;

public interface IDispositivoRepositorio extends JpaRepository<DispositivoJpa, Integer> {

}
