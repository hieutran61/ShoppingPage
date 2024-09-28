package com.hieutran.shoppingpage.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.Style}
 */
@Value
public class StyleDto implements Serializable {
    Integer id;
    String styleName;
}