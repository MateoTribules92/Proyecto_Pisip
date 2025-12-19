package com.uisrael.cursosapi.dominio.entidades;
import java.time.OffsetDateTime;
import java.net.InetAddress;

public final class Dispositivo {
	
	 private final long deviceId;
	    private final long siteId;
	    private final String nombre;
	    private final InetAddress ipAddress;
	    private final String ubicacion;
	    private final String modelo;
	    private final String firmwareVersion;
	    private final boolean estado;
	    private final OffsetDateTime lastHeartbeat;
	    private final OffsetDateTime createdAt;
	    private final OffsetDateTime updatedAt;
		
	    public Dispositivo(long deviceId, long siteId, String nombre, InetAddress ipAddress, String ubicacion,
				String modelo, String firmwareVersion, boolean estado, OffsetDateTime lastHeartbeat,
				OffsetDateTime createdAt, OffsetDateTime updatedAt) {
			super();
			this.deviceId = deviceId;
			this.siteId = siteId;
			this.nombre = nombre;
			this.ipAddress = ipAddress;
			this.ubicacion = ubicacion;
			this.modelo = modelo;
			this.firmwareVersion = firmwareVersion;
			this.estado = estado;
			this.lastHeartbeat = lastHeartbeat;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
		}

		public long getDeviceId() {
			return deviceId;
		}

		public long getSiteId() {
			return siteId;
		}

		public String getNombre() {
			return nombre;
		}

		public InetAddress getIpAddress() {
			return ipAddress;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		public String getModelo() {
			return modelo;
		}

		public String getFirmwareVersion() {
			return firmwareVersion;
		}

		public boolean isEstado() {
			return estado;
		}

		public OffsetDateTime getLastHeartbeat() {
			return lastHeartbeat;
		}

		public OffsetDateTime getCreatedAt() {
			return createdAt;
		}

		public OffsetDateTime getUpdatedAt() {
			return updatedAt;
		}
	    
	    
	    
}
