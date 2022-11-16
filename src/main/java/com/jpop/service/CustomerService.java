package com.jpop.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpop.error.CustomerNotFoundException;
import com.jpop.model.CustomerModel;
import com.jpop.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public List<CustomerModel> getAllCustomers() {
		return StreamSupport.stream(customerRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public CustomerModel getCustomerById(Long customerId) {
		return customerRepository.findById(customerId)
				.orElseThrow(() -> new CustomerNotFoundException("User not found: " + customerId));
	}
}
