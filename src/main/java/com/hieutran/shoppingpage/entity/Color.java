package com.hieutran.shoppingpage.entity;

import com.hieutran.shoppingpage.constants.enums.ColorName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Color")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "color_name")
    @Enumerated(EnumType.STRING)
    private ColorName colorName;

    @OneToMany(mappedBy = "color", fetch = FetchType.LAZY)
    private List<ProductVariant> productVariants;
}
