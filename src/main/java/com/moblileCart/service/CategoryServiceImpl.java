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
        Category category1 = new Category();
		if (category.isPresent()) {
			 category1=category.get();
			 if(category1.getCountNo() == null) {
				 category1.setCountNo(0);
			 }
			category1.setCountNo(category1.getCountNo()+1);
			categoryRepository.save(category1);
	
	}
   return category1.getProduct();
}
}