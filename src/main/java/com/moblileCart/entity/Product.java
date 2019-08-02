package com.moblileCart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long productId;
private String productName;
private Integer productCount;
public Long getProductId() {
	return productId;
}
public void setProductId(Long productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Integer getProductCount() {
	return productCount;
}
public void setProductCount(Integer productCount) {
	this.productCount = productCount;
}
}
