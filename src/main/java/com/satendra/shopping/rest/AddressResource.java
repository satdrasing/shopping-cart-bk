package com.satendra.shopping.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.satendra.shopping.rest.model.AddressData;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@CrossOrigin(origins="http://localhost:4200")
public interface AddressResource {

	@GET
	@Path("/address")
	public Response getAllAddress();
	
	@GET
	@Path("/address/{email}")
	public Response getAddressEmail(@PathParam("email") String email);
	
	@DELETE
	@Path("/address/delete/")
	public Response deleteAddressById(@QueryParam("id") String id);
	
	@POST
	@Path("/address/create")
	public Response saveAddress(AddressData address);
	
	@PUT
	@Path("/address/update")
	public Response updateAddress(AddressData address);
	
	
	@GET
	@Path("/address/id/{id}")
	public Response getAddressById(@PathParam("id") String id);

}
