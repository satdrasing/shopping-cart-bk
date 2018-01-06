package com.satendra.shopping.rest.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satendra.shopping.rest.dao.UserRepository;
import com.satendra.shopping.rest.entity.UserEntity;
import com.satendra.shopping.rest.model.UserData;







@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void  getUserDetails(Integer id, UserData userData) {
		UserEntity userEntity = userRepository.findOne(id);
		BeanUtils.copyProperties(userEntity, userData);
		
	}
	
	@Transactional
	public void getUserDetailsName(String userEmail, UserData userData) {
		UserEntity userEntity = userRepository.findbyEmail(userEmail);
		BeanUtils.copyProperties(userEntity, userData);
	}
	
	@Transactional
	public List<UserData> getAllUsers() {
		List<UserEntity> userEntirtList = new ArrayList<>();
		
		Iterable<UserEntity> allEntityData=  userRepository.findAll();
		allEntityData.forEach(userEntirtList::add);
		
		List<UserData> userDataList = new ArrayList<>();
		
		for (UserEntity userEntity : allEntityData) {
			UserData ud = new UserData();
			ud.setUserId(userEntity.getUserId());
			ud.setUserName(userEntity.getUserName());
			ud.setUserDob(userEntity.getUserDob());
			ud.setUserEmail(userEntity.getUserEmail());
			ud.setUserPassword(userEntity.getUserPassword());
			ud.setUserRole(userEntity.getUserRole());
			userDataList.add(ud);
		}
		
		return userDataList;
	}
	
	@Transactional
	public void saveUserData(UserData userData) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userData, userEntity);
		userRepository.save(userEntity);
	}

}
