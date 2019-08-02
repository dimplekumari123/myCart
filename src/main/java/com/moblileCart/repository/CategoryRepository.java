package com.moblileCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moblileCart.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
