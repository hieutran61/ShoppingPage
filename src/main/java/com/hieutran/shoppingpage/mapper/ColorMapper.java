package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.ColorDto;
import com.hieutran.shoppingpage.entity.Color;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ColorMapper {
    Color toEntity(ColorDto colorDto);

    ColorDto toDto(Color color);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Color partialUpdate(ColorDto colorDto, @MappingTarget Color color);
}