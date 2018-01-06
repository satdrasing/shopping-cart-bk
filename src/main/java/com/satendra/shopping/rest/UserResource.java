package com.satendra.shopping.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.satendra.shopping.rest.model.UserData;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public interface UserResource {
	
	@GET
	@Path("/user/info/{id}")
	Response getUser(@PathParam("id") int userId);
	
	@GET
	@Path("/user/name/{name}")
	Response validateLogin(@PathParam("name") String userName);


	@GET
	@Path("/user/all")
	Response getAllUsers();
	
	@POST
	@Path("/user/create")
	Response createUser(UserData userData);
}
