package com.walletService.paymentwalletservice.repository;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.walletService.paymentwalletservice.model.ShippngCart;

public interface ShippngCartRepository extends MongoRepository<ShippngCart,Integer> {
	Logger logger = LoggerFactory.getLogger(ShippngCartRepository.class);
	
	@Query("{cartId:?0}")
    Optional<ShippngCart> findBycartId(Integer cartId);

}
