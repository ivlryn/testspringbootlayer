package com.example.dday.controller;

import com.example.dday.model.ProductModel;
import com.example.dday.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<ProductModel>getAll() {
        return productRepository.findAll();
    }

    @PostMapping
    public ProductModel create(@RequestBody ProductModel product) {
        return productRepository.save(product);
    }
}
