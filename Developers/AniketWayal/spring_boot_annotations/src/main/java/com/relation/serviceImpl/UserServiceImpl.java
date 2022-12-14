package com.relation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.relation.entity.User;
import com.relation.exception.IdNotFoundException;
import com.relation.repository.UserRepository;
import com.relation.service.UserService;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userrepo; 

	@Override
	public User saveUser(User user) {
		return userrepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userrepo.findAll();
	}

	@Override
	public User getUserById(int id) {
		return userrepo.findById(id).orElseThrow(() -> new IdNotFoundException("User not exists"));
	}

	@Override
	public User updateUserById(User user, int id) {
		User existinguser = userrepo.findById(id).orElseThrow(()-> new IdNotFoundException("User not exists"));
	
		existinguser.setLastName(user.getLastName());
		existinguser.setPhone(user.getPhone());
		existinguser.setEmail(user.getEmail());
		userrepo.save(existinguser);
		return existinguser;
	}
	

	@Override
	public void deleteUserById(int id) {

		userrepo.findById(id);
		userrepo.deleteById(id);
	}

}
