package com.uisrael.cursosapi.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioJpa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long userId;
    private  String internalCode;
    private  String nombre;
    private  String apellido;
    private  String area;
    private  String email;
    private  boolean estado;
    private  LocalDate vigenteDesde;
    private  LocalDate vigenteHasta;
    private  OffsetDateTime createdAt;
    private  OffsetDateTime updatedAt;

}
