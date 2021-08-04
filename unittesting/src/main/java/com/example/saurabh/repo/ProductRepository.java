package com.example.saurabh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.saurabh.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
