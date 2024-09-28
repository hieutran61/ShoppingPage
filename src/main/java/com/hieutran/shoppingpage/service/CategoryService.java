package com.hieutran.shoppingpage.service;

import com.hieutran.shoppingpage.dto.CategoryDto;
import com.hieutran.shoppingpage.entity.Category;
import com.hieutran.shoppingpage.mapper.CategoryMapper;
import com.hieutran.shoppingpage.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;
    private CategoryMapper categoryMapper;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    public List<CategoryDto> getCategories() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream().map(categoryMapper::toDto).toList();
    }
}
