package com.hieutran.shoppingpage.dto;

import lombok.Data;

@Data
public class ProductFilterDto {
    private Integer categoryId;
    private Integer colorId;
    private Integer sizeId;
    private Integer styleId;
    private Double minPrice;
    private Double maxPrice;
}
