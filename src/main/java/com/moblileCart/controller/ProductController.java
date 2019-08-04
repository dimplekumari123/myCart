package com.moblileCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moblileCart.entity.Product;
import com.moblileCart.service.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
ProductServiceImpl productServiceImpl;
@GetMapping("/getProduct/{id}")
public ResponseEntity<Product> getProductDetail(@PathVariable Long id ){
	Product pd= productServiceImpl.getProductDetail(id);
	return new ResponseEntity<Product>(pd,HttpStatus.OK) ;
}
}
