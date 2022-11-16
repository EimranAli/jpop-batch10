package com.jpop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jpop.model.ProductModel;
import com.jpop.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;

	public List<ProductModel> getCustomers() {
		return productService.getAllProducts();
	}
}
