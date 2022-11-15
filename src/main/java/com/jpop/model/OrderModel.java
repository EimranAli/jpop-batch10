package com.jpop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order")
public class OrderModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;

}
