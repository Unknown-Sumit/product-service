package com.sumit.productservice.controllers;

import com.sumit.productservice.dtos.CreateProductDto;
import com.sumit.productservice.models.Product;
import com.sumit.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductDto createProductDto){
        return productService.createProduct(
                createProductDto.getTitle(),
                createProductDto.getDescription(),
                createProductDto.getPrice(),
                createProductDto.getImage(),
                createProductDto.getCategory()
        );
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }

    public void deleteProduct(Long id){

    }
}
