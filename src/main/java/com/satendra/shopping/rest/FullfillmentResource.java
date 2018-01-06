package com.satendra.shopping.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.satendra.shopping.rest.model.FullfillmentData;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface FullfillmentResource {
	
	@GET
	@Path("/fullfillment/{orderId}")
	public Response getAllFillfillments(@PathParam("orderId") String orderid);
	
	@POST
	@Path("/fullfillment/save")
	public Response saveFillfillments(List<FullfillmentData> fullfillmentDataList);
	

}
