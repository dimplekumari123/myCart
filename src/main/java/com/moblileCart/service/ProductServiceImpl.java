package com.moblileCart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moblileCart.entity.Product;
import com.moblileCart.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product getProductDetail(Long productId) {
		Optional<Product> product = productRepository.findById(productId);
		Product product1 = new Product();
		if (product.isPresent()) {
			product1 = product.get();
			if (product1.getProductCount() == null) {
				product1.setProductCount(0);
			}
			product1.setProductCount(product1.getProductCount() + 1);
			productRepository.save(product1);
		}
		return product1;

	}

}
