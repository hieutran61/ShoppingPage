package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.StyleDto;
import com.hieutran.shoppingpage.entity.Style;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StyleMapper {
    Style toEntity(StyleDto styleDto);

    StyleDto toDto(Style style);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Style partialUpdate(StyleDto styleDto, @MappingTarget Style style);
}