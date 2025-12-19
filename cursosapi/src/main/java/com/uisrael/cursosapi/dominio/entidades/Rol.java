package com.uisrael.cursosapi.dominio.entidades;


public final class Rol {
	
	private final long id;
	private final String nombre;
	private final String descripcion;
	private final boolean estado;
	
	
	public Rol(long id, String nombre, String descripcion, boolean estado) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}


	public long getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public boolean isEstado() {
		return estado;
	}
	
	
	
	
}
