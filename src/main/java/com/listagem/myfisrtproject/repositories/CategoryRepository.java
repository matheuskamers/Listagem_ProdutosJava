package com.listagem.myfisrtproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listagem.myfisrtproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
