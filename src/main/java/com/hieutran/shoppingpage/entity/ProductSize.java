package com.hieutran.shoppingpage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_size")
@Data
public class ProductSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private Size size;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "count_in_stock")
    private Integer countInStock;

}
