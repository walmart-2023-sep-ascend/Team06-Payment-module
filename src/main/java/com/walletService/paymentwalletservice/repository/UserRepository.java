package com.walletService.paymentwalletservice.repository;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import com.walletService.paymentwalletservice.model.Users;


public interface UserRepository extends MongoRepository<Users,Integer> {
	Logger logger = LoggerFactory.getLogger(UserRepository.class);
	
	@Query("{userId:?0}")
    Optional<Users> findByuserId(Integer userId);
	
	@Query("{userId:?0}")
	@Update("{'$set':{'wallet':?1}}")
	int updateWallet(int userId,float wallet);

}



