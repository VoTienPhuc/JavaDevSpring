package com.green.CoffeeMintClient.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.green.CoffeeMintClient.models.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User getUserByUserName(String username)
	{
		return repo.getUserByUsername(username);
	}
}
