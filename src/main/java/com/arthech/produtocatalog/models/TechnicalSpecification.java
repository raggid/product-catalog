package com.arthech.produtocatalog.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TechnicalSpecification {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
