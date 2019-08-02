package com.moblileCart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moblileCart.entity.Category;
import com.moblileCart.entity.Product;
import com.moblileCart.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Product> getProduct(Long categoryId) {
		// TODO Auto-generated method stub
		Optional<Category> category = categoryRepository.findById(categoryId);
		Category cate = new Category();
		
		if (category.isPresent()) {
			cate=category.get();
			cate.setCountNo(cate.getCountNo() + 1);
		}
				return cate.getProduct();
	}

}
