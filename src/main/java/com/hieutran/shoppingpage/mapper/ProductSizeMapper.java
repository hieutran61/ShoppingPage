package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.ProductSizeDto;
import com.hieutran.shoppingpage.entity.ProductSize;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductSizeMapper {
    ProductSize toEntity(ProductSizeDto productSizeDto);

    ProductSizeDto toDto(ProductSize productSize);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProductSize partialUpdate(ProductSizeDto productSizeDto, @MappingTarget ProductSize productSize);
}