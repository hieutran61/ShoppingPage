package com.hieutran.shoppingpage.repository;

import com.hieutran.shoppingpage.entity.Category;
import com.hieutran.shoppingpage.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
