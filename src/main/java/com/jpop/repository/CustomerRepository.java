package com.jpop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpop.model.CustomerModel;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerModel, Long> {

}
