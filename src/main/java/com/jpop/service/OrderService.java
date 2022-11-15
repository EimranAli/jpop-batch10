package com.jpop.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpop.model.OrderModel;
import com.jpop.repository.OrderRepository;

public class OrderService {
	@Autowired
	OrderRepository orderRepository;

	public List<OrderModel> getAllOrders() {
		return StreamSupport.stream(orderRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
}
