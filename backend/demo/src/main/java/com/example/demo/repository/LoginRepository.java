package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface LoginRepository extends JpaRepository<User, Integer> {	
	Optional<User> findByUserName(String username);
}
