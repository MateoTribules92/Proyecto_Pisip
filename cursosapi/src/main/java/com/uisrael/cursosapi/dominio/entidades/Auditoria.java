package com.uisrael.cursosapi.dominio.entidades;
import java.time.OffsetDateTime;
import java.net.InetAddress;

public final class Auditoria {
	
	 private final long auditId;
	    private final long userId;
	    private final String accion;
	    private final String entidad;
	    private final Long entidadId;          
	    private final OffsetDateTime timestamp;
	    private final InetAddress ipOrigen;
		
	    public Auditoria(long auditId, long userId, String accion, String entidad, Long entidadId,
				OffsetDateTime timestamp, InetAddress ipOrigen) {
			super();
			this.auditId = auditId;
			this.userId = userId;
			this.accion = accion;
			this.entidad = entidad;
			this.entidadId = entidadId;
			this.timestamp = timestamp;
			this.ipOrigen = ipOrigen;
		}

		public long getAuditId() {
			return auditId;
		}

		public long getUserId() {
			return userId;
		}

		public String getAccion() {
			return accion;
		}

		public String getEntidad() {
			return entidad;
		}

		public Long getEntidadId() {
			return entidadId;
		}

		public OffsetDateTime getTimestamp() {
			return timestamp;
		}

		public InetAddress getIpOrigen() {
			return ipOrigen;
		}
	    
	    
	    

}
