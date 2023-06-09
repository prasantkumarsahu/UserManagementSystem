package com.prasant.UserManagementSystem.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prasant.UserManagementSystem.Models.User;
import com.prasant.UserManagementSystem.Services.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping(value = "addUser")
	public String addUser(@Valid @RequestBody User newUser) {
		return userService.addUser(newUser);
	}

	@GetMapping(value = "getUser/{userId}")
	public User getUserById(@PathVariable int userId) {
		return userService.getUserById(userId);
	}

	@GetMapping(value = "getAllUser")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@PutMapping(value = "updateUserInfo/{userId}")
	public String updateUserInfo(@Valid @RequestBody User updatedUser, @PathVariable("userId") int userId) {
		return userService.updateUser(updatedUser, userId);
	}

	@DeleteMapping(value = "deleteUser/{userId}")
	public String deleteUser(@PathVariable int userId) {
		return userService.deleteUser(userId);
	}

}
