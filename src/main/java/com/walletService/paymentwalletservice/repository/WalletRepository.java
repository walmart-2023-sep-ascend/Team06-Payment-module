package com.walletService.paymentwalletservice.repository;


import java.time.LocalDateTime;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.walletService.paymentwalletservice.model.EventCodeLog;

public interface WalletRepository extends MongoRepository<EventCodeLog,Integer> {
	Logger logger = LoggerFactory.getLogger(WalletRepository.class);
	
	@Query("{userId:?0}")
    Optional<EventCodeLog> findByuserId(Integer userId);

	@Query("{eventId:?0}")
	 Optional<EventCodeLog> findByeventId(Integer userId);

}
