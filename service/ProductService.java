package com.example.springboot_category_product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.springboot_category_product.entity.Product;
import com.example.springboot_category_product.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public Page<Product> getAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public Product getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Product create(Product product) {
        return repo.save(product);
    }

    public Product update(Long id, Product product) {
        Product existing = getById(id);
        existing.setName(product.getName());
        existing.setPrice(product.getPrice());
        existing.setCategory(product.getCategory());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}