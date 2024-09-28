package com.hieutran.shoppingpage.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.ProductVariant}
 */
@Value
public class ProductVariantDto implements Serializable {
    Integer id;
    ColorDto color;
    SizeDto size;
    Integer countInStock;
}