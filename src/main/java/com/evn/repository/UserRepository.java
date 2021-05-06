package com.evn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evn.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	public User findByUsernameAndPassword (String username, String password);
}
