package com.example.SportyShoes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.SportyShoes.entity.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
List<Admin> findByUsernameAndPassword(String username, String Password);
Admin findByUsername(String Username);
}
