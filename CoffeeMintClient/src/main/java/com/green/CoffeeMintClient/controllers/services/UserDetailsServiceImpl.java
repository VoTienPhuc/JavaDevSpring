package com.green.CoffeeMintClient.controllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.green.CoffeeMintClient.dao.UserRepository;
import com.green.CoffeeMintClient.helpers.AppString;
import com.green.CoffeeMintClient.models.User;

public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.getUserByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException(AppString.userNameNotFound);
		return null;
	}
}
