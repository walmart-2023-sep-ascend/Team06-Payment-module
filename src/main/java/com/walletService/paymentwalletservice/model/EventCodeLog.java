package com.walletService.paymentwalletservice.model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="EventCodeLog")
public class EventCodeLog {
	private int userId;
	private int eventId;
	private LocalDateTime eventEntryTimeStamp;
	private LocalDateTime eventExpiryTimeStamp;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public LocalDateTime getEventEntryTimeStamp() {
		return eventEntryTimeStamp;
	}
	public void setEventEntryTimeStamp(LocalDateTime eventEntryTimeStamp) {
		this.eventEntryTimeStamp = eventEntryTimeStamp;
	}
	public LocalDateTime getEventExpiryTimeStamp() {
		return eventExpiryTimeStamp;
	}
	public void setEventExpiryTimeStamp(LocalDateTime eventExpiryTimeStamp) {
		this.eventExpiryTimeStamp = eventExpiryTimeStamp;
	}
	@Override
	public String toString() {
		return "EventCodeLog [userId=" + userId + ", eventId=" + eventId + ", eventEntryTimeStamp="
				+ eventEntryTimeStamp + ", eventExpiryTimeStamp=" + eventExpiryTimeStamp + "]";
	} 
	

}
