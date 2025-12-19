package com.uisrael.cursosapi.dominio.entidades;
import java.time.OffsetDateTime;

public final class Sitio {
	
	 	private final long siteId;
	    private final String nombre;
	    private final String direccion;
	    private final OffsetDateTime createdAt;
		
	    public Sitio(long siteId, String nombre, String direccion, OffsetDateTime createdAt) {
			super();
			this.siteId = siteId;
			this.nombre = nombre;
			this.direccion = direccion;
			this.createdAt = createdAt;
		}
		
	    public long getSiteId() {
			return siteId;
		}
		public String getNombre() {
			return nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public OffsetDateTime getCreatedAt() {
			return createdAt;
		}

	    
}
