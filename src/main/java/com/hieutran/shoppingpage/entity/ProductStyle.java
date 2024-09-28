package com.hieutran.shoppingpage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Product_Style")
@Data
public class ProductStyle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "style_id")
    private Style style;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
