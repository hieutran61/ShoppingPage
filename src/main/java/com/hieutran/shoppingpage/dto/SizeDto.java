package com.hieutran.shoppingpage.dto;

import com.hieutran.shoppingpage.constants.enums.SizeName;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.hieutran.shoppingpage.entity.Size}
 */
@Value
public class SizeDto implements Serializable {
    Integer id;
    SizeName sizeName;
}