package com.example.springboot_category_product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_category_product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}