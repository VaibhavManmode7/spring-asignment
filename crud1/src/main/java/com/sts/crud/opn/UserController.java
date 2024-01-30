package com.sts.crud.opn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	private UserRepository UserRepository;
	
	@PostMapping("/add")
	public User add(RequestBody User ) {
		return UserRepository.save(null);
	}
	@GetMapping("/all")
	public List<User> user(){
		return UserRepository.findAll();
	}
	@GetMapping("/{id}")
	public User user(@PathVariable(value="id")int id){
		return UserRepository.findById(id);
	}

}
