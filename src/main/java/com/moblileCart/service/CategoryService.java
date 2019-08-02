package com.moblileCart.service;

import java.util.List;

import com.moblileCart.entity.Product;

public interface CategoryService {
public List<Product> getProduct(Long categoryId);
}
