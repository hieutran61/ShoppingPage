package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.ProductColorDto;
import com.hieutran.shoppingpage.entity.ProductColor;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductColorMapper {
    ProductColor toEntity(ProductColorDto productColorDto);

    ProductColorDto toDto(ProductColor productColor);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProductColor partialUpdate(ProductColorDto productColorDto, @MappingTarget ProductColor productColor);
}