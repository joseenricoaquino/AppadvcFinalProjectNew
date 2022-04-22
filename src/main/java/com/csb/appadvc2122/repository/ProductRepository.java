package com.csb.appadvc2122.repository;

import com.csb.appadvc2122.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
