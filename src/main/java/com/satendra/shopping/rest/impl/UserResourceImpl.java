package com.satendra.shopping.rest.impl;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.satendra.shopping.rest.UserResource;
import com.satendra.shopping.rest.model.UserData;
import com.satendra.shopping.rest.services.UserService;

@Component("userResource")
public class UserResourceImpl implements UserResource {

	@Autowired
	private UserService useService;

	@Override
	public Response getUser(int userId) {
		
		UserData userData = new UserData();
		useService.getUserDetails(1, userData);

		return Response.status(Status.OK).entity(userData).build();
	}

	@Override
	public Response validateLogin(String userEmail) {
		UserData userData = new UserData();
		useService.getUserDetailsName(userEmail, userData);
		return Response.status(Status.OK).entity(userData).build();
	}

	@Override
	public Response getAllUsers() {

		
		List<UserData> userDataList = useService.getAllUsers();
		
		return Response.status(Status.OK).entity(userDataList).build();
	}

	@Override
	public Response createUser(UserData userData) {
		useService.saveUserData(userData);
		return Response.status(Status.OK).entity(userData).build();
	}

}
