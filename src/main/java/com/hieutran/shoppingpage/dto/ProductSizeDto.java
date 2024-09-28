package com.hieutran.shoppingpage.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.ProductSize}
 */
@Value
public class ProductSizeDto implements Serializable {
    Integer id;
    SizeDto size;
    Integer countInStock;
}