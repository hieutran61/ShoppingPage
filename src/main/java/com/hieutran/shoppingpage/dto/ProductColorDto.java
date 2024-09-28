package com.hieutran.shoppingpage.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.ProductColor}
 */
@Value
public class ProductColorDto implements Serializable {
    Integer id;
    ColorDto color;
    Integer countInStock;
}