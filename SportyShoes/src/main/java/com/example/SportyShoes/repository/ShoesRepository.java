package com.example.SportyShoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SportyShoes.entity.Shoes;

@Repository
public interface ShoesRepository extends CrudRepository<Shoes, Integer> {

	 @Query(value = "SELECT category ,count(category) FROM Shoes s Group BY category")
	    List<String> findByCategory();
}
