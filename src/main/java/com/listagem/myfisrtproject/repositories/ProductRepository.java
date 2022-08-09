package com.listagem.myfisrtproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listagem.myfisrtproject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
