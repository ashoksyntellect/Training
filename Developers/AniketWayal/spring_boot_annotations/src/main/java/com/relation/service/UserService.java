package com.relation.service;

import java.util.List;

import com.relation.entity.User;

public interface UserService {

	User saveUser(User user); // save user details in db table
	
	List<User> getAllUser(); // fetch all user deatils from db table 
	
	User getUserById(int id); // fetch all user deatils from db tablle based on id
	
	User updateUserById(User user, int id );
	
	void deleteUserById(int id);
}
