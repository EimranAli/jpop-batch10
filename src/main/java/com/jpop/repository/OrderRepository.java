package com.jpop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpop.model.OrderModel;

@Repository
public interface OrderRepository extends CrudRepository<OrderModel, Long> {

}
