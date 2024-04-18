package com.sumit.productservice.controllers;

import com.sumit.productservice.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/products")
    public void createProduct(){

    }

    @GetMapping("/products")
    public void getAllProducts(){

    }

    @GetMapping("/products/{id}")
    public void getProductById(@PathVariable("id") String id){

    }

    public void deleteProduct(Long id){

    }
}
