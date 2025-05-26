package com.example.springboot_category_product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;

import com.example.springboot_category_product.entity.Category;
import com.example.springboot_category_product.entity.Product;
import com.example.springboot_category_product.repository.CategoryRepository;
import com.example.springboot_category_product.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @Autowired
    private CategoryRepository categoryRepo;

    @GetMapping("/all")
    public Page<Product> getAll(@RequestParam(defaultValue = "0") int page,
                                @RequestParam(defaultValue = "10") int size) {
        return service.getAll(PageRequest.of(page, size));
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        Category category = categoryRepo.findById(product.getCategory().getId()).orElseThrow();
        product.setCategory(category);
        return service.create(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        Category category = categoryRepo.findById(product.getCategory().getId()).orElseThrow();
        product.setCategory(category);
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}