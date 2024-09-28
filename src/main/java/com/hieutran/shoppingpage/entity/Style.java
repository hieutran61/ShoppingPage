package com.hieutran.shoppingpage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Style")
@Data
public class Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "style_name")
    private String styleName;

    @OneToMany(mappedBy = "style", fetch = FetchType.LAZY)
    private List<ProductStyle> productStyles;

}
