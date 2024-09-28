package com.hieutran.shoppingpage.repository;

import com.hieutran.shoppingpage.entity.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StyleRepository extends JpaRepository<Style, Integer> {

}
