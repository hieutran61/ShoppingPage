package com.hieutran.shoppingpage.dto;

import com.hieutran.shoppingpage.constants.enums.ColorName;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.Color}
 */
@Value
public class ColorDto implements Serializable {
    Integer id;
    ColorName colorName;

}