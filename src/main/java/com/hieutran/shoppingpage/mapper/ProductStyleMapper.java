package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.ProductStyleDto;
import com.hieutran.shoppingpage.entity.ProductStyle;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductStyleMapper {
    ProductStyle toEntity(ProductStyleDto productStyleDto);

    ProductStyleDto toDto(ProductStyle productStyle);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ProductStyle partialUpdate(ProductStyleDto productStyleDto, @MappingTarget ProductStyle productStyle);
}