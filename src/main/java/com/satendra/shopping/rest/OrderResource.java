package com.satendra.shopping.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.satendra.shopping.rest.model.OrderData;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface  OrderResource {
	
	
	@GET
	@Path("/order/all")
	public Response getAllOrders();
	
	@POST
	@Path("/order/save")
	public Response saveAllOrder(OrderData orderData);
	
	@GET
	@Path("/order/{email}")
	Response geOrderByEmail(@PathParam("email") String userName);
	
	
	@GET
	@Path("/order/orderid/{orderId}")
	Response geOrderByOrderId(@PathParam("orderId") String orderId);
	
	@PUT
	@Path("/order/update")
	public Response updateOrder(OrderData orderData);
	
}
