package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.ProductVariantDto;
import com.hieutran.shoppingpage.entity.ProductVariant;
import com.hieutran.shoppingpage.mapper.ColorMapper;
import com.hieutran.shoppingpage.mapper.SizeMapper;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {ColorMapper.class, SizeMapper.class})
public interface ProductVariantMapper {
    ProductVariant toEntity(ProductVariantDto productVariantDto);

    ProductVariantDto toDto(ProductVariant productVariant);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProductVariant partialUpdate(ProductVariantDto productVariantDto, @MappingTarget ProductVariant productVariant);
}