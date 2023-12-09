package com.walletService.paymentwalletservice.model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection="EventCodeLog")
public class EventCodeLog {
	private int userId;
	private int eventId;
	private LocalDateTime eventEntryTimeStamp;
	private LocalDateTime eventExpiryTimeStamp;
	@Override
	public String toString() {
		return "EventCodeLog [userId=" + userId + ", eventId=" + eventId + ", eventEntryTimeStamp="
				+ eventEntryTimeStamp + ", eventExpiryTimeStamp=" + eventExpiryTimeStamp + "]";
	}
	
}
