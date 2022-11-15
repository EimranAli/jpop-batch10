package com.jpop.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpop.model.ProductModel;
import com.jpop.repository.ProductRepository;

public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public List<ProductModel> getAllProducts() {
		return StreamSupport.stream(productRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
