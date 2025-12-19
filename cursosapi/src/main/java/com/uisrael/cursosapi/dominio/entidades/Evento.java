package com.uisrael.cursosapi.dominio.entidades;
import java.time.OffsetDateTime;

public final class Evento {
	
	  private final long eventId;
	    private final long deviceId;
	    private final Long userId;          
	    private final String reasonCode;
	    private final OffsetDateTime timestamp;
	    private final String rawPayload;    
	    private final OffsetDateTime createdAt;
		
	    
	    public Evento(long eventId, long deviceId, Long userId, String reasonCode, OffsetDateTime timestamp,
				String rawPayload, OffsetDateTime createdAt) {
			super();
			this.eventId = eventId;
			this.deviceId = deviceId;
			this.userId = userId;
			this.reasonCode = reasonCode;
			this.timestamp = timestamp;
			this.rawPayload = rawPayload;
			this.createdAt = createdAt;
		}


		public long getEventId() {
			return eventId;
		}


		public long getDeviceId() {
			return deviceId;
		}


		public Long getUserId() {
			return userId;
		}


		public String getReasonCode() {
			return reasonCode;
		}


		public OffsetDateTime getTimestamp() {
			return timestamp;
		}


		public String getRawPayload() {
			return rawPayload;
		}


		public OffsetDateTime getCreatedAt() {
			return createdAt;
		}
	    
	    

}
