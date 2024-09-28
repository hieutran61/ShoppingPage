package com.hieutran.shoppingpage.repository;

import com.hieutran.shoppingpage.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p " +
            "JOIN p.category c " +
            "JOIN p.productVariants pv " +
            "JOIN pv.color col " +
            "JOIN pv.size s " +
            "JOIN p.productStyles ps " +
            "JOIN ps.style st " +
            "WHERE (:categoryId IS NULL OR c.id = :categoryId) " +
            "AND (:colorId IS NULL OR col.id = :colorId) " +
            "AND (:sizeId IS NULL OR s.id = :sizeId) " +
            "AND (:styleId IS NULL OR st.id = :styleId) " +
            "AND (:minPrice IS NULL OR (p.discountPrice IS NOT NULL AND p.discountPrice >= :minPrice) OR (p.discountPrice IS NULL AND p.originalPrice >= :minPrice)) " +
            "AND (:maxPrice IS NULL OR (p.discountPrice IS NOT NULL AND p.discountPrice <= :maxPrice) OR (p.discountPrice IS NULL AND p.originalPrice <= :maxPrice))")
    List<Product> findProductsByFilter(@Param("categoryId") Integer categoryId,
                                       @Param("colorId") Integer colorId,
                                       @Param("sizeId") Integer sizeId,
                                       @Param("styleId") Integer styleId,
                                       @Param("minPrice") Double minPrice,
                                       @Param("maxPrice") Double maxPrice);

}

