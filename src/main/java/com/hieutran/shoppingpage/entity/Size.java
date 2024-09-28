package com.hieutran.shoppingpage.entity;

import com.hieutran.shoppingpage.constants.enums.SizeName;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Size")
@Data
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_name")
    @Enumerated(EnumType.STRING)
    private SizeName sizeName;

    @OneToMany(mappedBy = "size", fetch = FetchType.LAZY)
    private List<ProductSize> productSizes;

}
