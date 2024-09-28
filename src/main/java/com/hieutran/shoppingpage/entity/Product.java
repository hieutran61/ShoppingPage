package com.hieutran.shoppingpage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "original_price")
    private Double originalPrice;

    @Column(name = "discount_price")
    private Double discountPrice;

    @Column(name = "discount_start_date")
    private LocalDateTime discountStartDate;

    @Column(name = "discount_end_date")
    private LocalDateTime discountEndDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<ProductVariant> productVariants;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<ProductStyle> productStyles;

    @ElementCollection
    @CollectionTable(name = "Product_Image", joinColumns = @JoinColumn(name = "product_id"))
    @Column(name = "image_url")
    private List<String> images;

    @Column(name = "average_rating")
    private Float averageRating;

    @Column(name = "num_of_reviews")
    private Integer numOfReviews;

}
