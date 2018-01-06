package com.satendra.shopping.rest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.satendra.shopping.rest.entity.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, String> {
	
	@Query("select c from OrderEntity c where c.email=:email")
	List<OrderEntity> findbyEmail(@Param("email") String email);

}
