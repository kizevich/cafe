package main.java.by.itstep.cafe.service;

import by.itstep.cafe.dao.entity.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    void removeProduct(int id);

    List<Product> listProducts();

    Product getProduct(String name);
}
