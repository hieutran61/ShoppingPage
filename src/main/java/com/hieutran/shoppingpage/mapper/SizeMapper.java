package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.SizeDto;
import com.hieutran.shoppingpage.entity.Size;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface SizeMapper {
    Size toEntity(SizeDto sizeDto);

    SizeDto toDto(Size size);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Size partialUpdate(SizeDto sizeDto, @MappingTarget Size size);
}