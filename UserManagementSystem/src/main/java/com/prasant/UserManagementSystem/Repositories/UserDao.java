package com.prasant.UserManagementSystem.Repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prasant.UserManagementSystem.Services.Models.User;

@Repository
public class UserDao {
	private List<User> userList;

	public UserDao() {
		userList = new ArrayList<>();
		userList.add(new User(1, "Prasant", "Angul, Odisha", 8280822938l));
		userList.add(new User(2, "Sipun", "Cuttak, Odisha", 6452846378l));
		userList.add(new User(3, "Prasant", "Dhenkanal, Odisha", 9757453646l));
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
