package com.moblileCart.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moblileCart.entity.Product;
import com.moblileCart.service.CategoryServiceImpl;

@RestController
@RequestMapping("/category")
public class CategoryController {
@Autowired  
CategoryServiceImpl categoryServiceImpl;
@GetMapping("/get/{id}")
public ResponseEntity<List<Product>> getProduct(@PathVariable Long id){
	List<Product> product=categoryServiceImpl.getProduct(id);
	return new ResponseEntity<List<Product>> (product,HttpStatus.OK);
}
}
