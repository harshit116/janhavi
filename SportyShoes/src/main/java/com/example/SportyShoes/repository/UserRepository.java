package com.example.SportyShoes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.SportyShoes.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
List<User> findByUsernameAndPassword(String username, String Password);
User findByUsername(String Username);
}
