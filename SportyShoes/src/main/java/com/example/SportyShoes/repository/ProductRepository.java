package com.example.SportyShoes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SportyShoes.entity.Shoes;


public interface ProductRepository extends CrudRepository<Shoes, Integer> {
List<Shoes>findByCategory(String name);
}
