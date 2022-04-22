package com.csb.appadvc2122.services;

import com.csb.appadvc2122.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> list();

    void add(ProductDTO productDTO);

    ProductDTO get(Long id);

    void update(ProductDTO productDTO);

    void delete(Long id);
}
