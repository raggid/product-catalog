package com.arthech.produtocatalog.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private ProductProvider provider;

    private String provider_name;

    private String product_code;

    private String product_name;

    private String product_model;

    private String observation;

    @OneToMany(mappedBy = "product")
    private List<TechnicalSpecification> specs;

}
