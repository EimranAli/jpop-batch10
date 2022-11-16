package com.jpop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jpop.model.OrderModel;
import com.jpop.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;

	public List<OrderModel> getOrders() {
		return orderService.getAllOrders();
	}
}
