package com.hieutran.shoppingpage.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.Category}
 */
@Value
public class CategoryDto implements Serializable {
    Integer id;
    String name;
}