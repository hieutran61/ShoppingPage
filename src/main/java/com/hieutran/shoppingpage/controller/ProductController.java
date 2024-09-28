package com.hieutran.shoppingpage.controller;


import com.hieutran.shoppingpage.dto.ProductDto;
import com.hieutran.shoppingpage.dto.ProductFilterDto;
import com.hieutran.shoppingpage.entity.Product;
import com.hieutran.shoppingpage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    @PostMapping("/filter")
    public ResponseEntity<List<ProductDto>> getProductsByFilter(@RequestBody ProductFilterDto filter) {
        return ResponseEntity.ok(productService.getProductsByFilter(filter));
    }

}
