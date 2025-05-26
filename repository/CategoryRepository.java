package com.example.springboot_category_product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_category_product.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}