package com.hieutran.shoppingpage.service;

import com.hieutran.shoppingpage.dto.ProductDto;
import com.hieutran.shoppingpage.dto.ProductFilterDto;
import com.hieutran.shoppingpage.entity.Product;
import com.hieutran.shoppingpage.mapper.ProductMapper;
import com.hieutran.shoppingpage.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;
    private ProductMapper productMapper;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDto> getProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(productMapper::toDto).toList();
    }

    public List<ProductDto> getProductsByFilter(ProductFilterDto filter) {
        List<Product> products = productRepository.findProductsByFilter(
                filter.getCategoryId(),
                filter.getColorId(),
                filter.getSizeId(),
                filter.getStyleId(),
                filter.getMinPrice(),
                filter.getMaxPrice()
        );
        return products.stream().map(productMapper::toDto).toList();
    }
}
