package com.hieutran.shoppingpage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_color")
@Data
public class ProductColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @Column(name = "count_in_stock")
    private Integer countInStock;

}
