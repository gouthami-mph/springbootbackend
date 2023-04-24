package spring.backend.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.backend.springbootbackend.entity.UserEntity;
import spring.backend.springbootbackend.repositroy.Userepository;

@RestController

public class UserController {

	@Autowired
	Userepository repository;
	
	@PostMapping("/addUser")
	public UserEntity addUser(@RequestBody UserEntity user) {
		return repository.save(user);
		
	}
	
	@GetMapping("/users")
	public  List<UserEntity> UserList() {
		return repository.findAll();
		
	}
	
	@PutMapping("/updateUser")
	public  UserEntity Update(@RequestBody UserEntity entity) {
		return repository.saveAndFlush(entity);
		
	}
	
	@DeleteMapping("/deleteUser")
	public  String delete(@RequestParam long id) {
		repository.deleteById(id);
		return "User is deleted";
		
	}
	
}
