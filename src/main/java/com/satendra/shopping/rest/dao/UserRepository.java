package com.satendra.shopping.rest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.satendra.shopping.rest.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {

	
	@Query("select c from UserEntity c where c.userEmail=:email")
	UserEntity findbyEmail(@Param("email") String userEmail);
	
	
}
