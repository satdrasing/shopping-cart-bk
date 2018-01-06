package com.satendra.shopping.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.satendra.shopping.rest.entity.ShoppingEntity;

public interface ShoppingRespository extends CrudRepository<ShoppingEntity, Integer> {

}
