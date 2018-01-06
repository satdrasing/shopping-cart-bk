package com.satendra.shopping.rest.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.satendra.shopping.rest.entity.FullfillmentEntity;

public interface FullfillmentRepository extends CrudRepository<FullfillmentEntity, Integer>{
	
	@Query("SELECT A FROM FullfillmentEntity A WHERE A.orderId = :orderId ")
	public List<FullfillmentEntity> getAllRecordByOrderId(@Param("orderId") String orderId);

}
