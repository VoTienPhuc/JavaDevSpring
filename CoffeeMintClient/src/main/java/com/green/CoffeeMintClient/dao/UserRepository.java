package com.green.CoffeeMintClient.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.green.CoffeeMintClient.models.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	@Query("SELECT u FROM User u WHERE u.username= :username and u.password=password ")
	public User getUserByUsername(@Param("username")String username);
}
