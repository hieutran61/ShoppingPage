package com.hieutran.shoppingpage.mapper;

import com.hieutran.shoppingpage.dto.ProductDto;
import com.hieutran.shoppingpage.entity.Product;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    Product toEntity(ProductDto productDto);

    @AfterMapping
    default void linkProductVariants(@MappingTarget Product product) {
        product.getProductVariants().forEach(productVariant -> productVariant.setProduct(product));
    }

    @AfterMapping
    default void linkProductStyles(@MappingTarget Product product) {
        product.getProductStyles().forEach(productStyle -> productStyle.setProduct(product));
    }

    ProductDto toDto(Product product);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Product partialUpdate(ProductDto productDto, @MappingTarget Product product);
}