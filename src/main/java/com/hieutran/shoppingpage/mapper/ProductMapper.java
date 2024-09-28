package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.ProductDto;
import com.hieutran.shoppingpage.entity.Product;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    Product toEntity(ProductDto productDto);

    @AfterMapping
    default void linkProductSizes(@MappingTarget Product product) {
        product.getProductSizes().forEach(productSize -> productSize.setProduct(product));
    }

    @AfterMapping
    default void linkProductColors(@MappingTarget Product product) {
        product.getProductColors().forEach(productColor -> productColor.setProduct(product));
    }

    ProductDto toDto(Product product);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Product partialUpdate(ProductDto productDto, @MappingTarget Product product);
}