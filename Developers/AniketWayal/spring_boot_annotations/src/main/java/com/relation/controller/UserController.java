package com.relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.relation.entity.User;
import com.relation.service.UserService;

import jakarta.websocket.server.PathParam;

public class UserController {

	@Autowired
	private UserService us;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return new ResponseEntity<User>(us.saveUser(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		return us.getAllUser();
	}
	
	@GetMapping("/getUserById/{id}")
	public ResponseEntity<User> getUSerById(@PathVariable("id") int id){
			return new ResponseEntity<User>(us.getUserById(id),HttpStatus.OK);
		}
	
	@DeleteMapping("/deleteUserById/{id}")
	public ResponseEntity<String> deleteUSerById(@PathVariable("id") int id ){
		us.deleteUserById(id);
		return new ResponseEntity<String>("deleted Successfully" , HttpStatus.OK);
	}
	
	@PutMapping("/updateById/{id}")
	public ResponseEntity<User> updateUserById(@PathVariable("id") int id , @RequestBody User user){
		return new ResponseEntity<User>(us.updateUserById(user, id),HttpStatus.OK);
	}
}
