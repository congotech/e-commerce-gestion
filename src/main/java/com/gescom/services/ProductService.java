package com.gescom.services;

import com.gescom.entities.Product;

import java.util.List;

public interface ProductService {
    void createProduct(Product product);
    List<Product> findAll();
    void deleteProduct(long id);
    Product editProduct(Product product, long id);
}
