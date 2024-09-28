package com.hieutran.shoppingpage.dto;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.Product}
 */
@Value
public class ProductDto implements Serializable {
    Integer id;
    String name;
    String description;
    Double originalPrice;
    Double discountPrice;
    LocalDateTime discountStartDate;
    LocalDateTime discountEndDate;
    CategoryDto category;
    List<ProductSizeDto> productSizes;
    List<ProductColorDto> productColors;
    List<String> images;
    Float averageRating;
    Integer numOfReviews;
}