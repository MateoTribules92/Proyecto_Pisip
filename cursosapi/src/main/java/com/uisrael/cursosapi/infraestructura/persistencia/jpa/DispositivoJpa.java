package com.uisrael.cursosapi.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.net.InetAddress;
import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dispositivo")
public class DispositivoJpa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deviceId;
	private long siteId;
	private String nombre;
	private InetAddress ipAddress;
	private String ubicacion;
	private String modelo;
	private String firmwareVersion;
	private boolean estado;
	private OffsetDateTime lastHeartbeat;
	private OffsetDateTime createdAt;
	private OffsetDateTime updatedAt;


}
