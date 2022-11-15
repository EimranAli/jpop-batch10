package com.jpop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpop.model.CustomerModel;
import com.jpop.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping
	List<CustomerModel> getCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/{customerId}")
	ResponseEntity<CustomerModel> getCustomerById(Long id) {
		return ResponseEntity.ok(customerService.getCustomerById(id));
	}

}
