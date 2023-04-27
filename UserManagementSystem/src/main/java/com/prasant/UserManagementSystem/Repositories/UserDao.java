package com.prasant.UserManagementSystem.Repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prasant.UserManagementSystem.Models.User;

@Repository
public class UserDao {
	private List<User> userList;

	public UserDao() {
		userList = new ArrayList<>();
	}

	public List<User> getAllUsersFromDataSource() {
		return userList;
	}

	public boolean insertUser(User newUser) {
		userList.add(newUser);
		return true;
	}

	public void remove(User user) {
		userList.remove(user);
	}
}
