package com.hieutran.shoppingpage.entity;

import com.hieutran.shoppingpage.constants.enums.ColorName;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Color")
@Data
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "color_name")
    private ColorName colorName;

    @OneToMany(mappedBy = "color", fetch = FetchType.LAZY)
    private List<ProductColor> productColors;
}
