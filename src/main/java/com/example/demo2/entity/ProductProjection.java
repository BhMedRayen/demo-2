package com.example.demo2.entity;

import org.springframework.data.rest.core.config.Projection;
import org.springframework.data.repository.CrudRepository;


@Projection(name = "Product",types = ProductProjection.class)
public interface ProductProjection extends Projection {
    public Long getId();
    public String getName();
    public double getPrice();
}