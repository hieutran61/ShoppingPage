package com.hieutran.shoppingpage.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.ProductStyle}
 */
@Value
public class ProductStyleDto implements Serializable {
    Integer id;
    StyleDto style;
}