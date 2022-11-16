package com.jpop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpop.model.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long> {

}
