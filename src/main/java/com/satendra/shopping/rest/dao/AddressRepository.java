package com.satendra.shopping.rest.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.satendra.shopping.rest.entity.AddressEntity;

public interface AddressRepository extends CrudRepository<AddressEntity, Integer>{
	
	@Query("SELECT A FROM AddressEntity A WHERE A.loginUserEmail = :loginUserEmail ")
	public List<AddressEntity> getAddressbyEmail(@Param("loginUserEmail") String email);

}
