package com.example.springboot_category_product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.springboot_category_product.entity.Category;
import com.example.springboot_category_product.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repo;

    public Page<Category> getAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public Category getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Category create(Category category) {
        return repo.save(category);
    }

    public Category update(Long id, Category category) {
        Category existing = getById(id);
        existing.setName(category.getName());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}