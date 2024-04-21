package com.sumit.productservice.services;

import com.sumit.productservice.models.Product;

import java.util.List;

public interface ProductService {
    public Product getSingleProduct(Long id);
    public List<Product> getAllProducts();

    public Product createProduct(String title , String description , double price , String image , String category);
}
