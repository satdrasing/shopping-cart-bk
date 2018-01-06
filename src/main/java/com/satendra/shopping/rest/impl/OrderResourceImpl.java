package com.satendra.shopping.rest.impl;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.satendra.shopping.rest.OrderResource;
import com.satendra.shopping.rest.model.OrderData;
import com.satendra.shopping.rest.services.OrderService;

@Component("orderResource")
public class OrderResourceImpl implements OrderResource {

	@Autowired
	private OrderService orderService;

	@Override
	public Response getAllOrders() {

		return null;
	}

	@Override
	public Response saveAllOrder(OrderData orderData) {
		orderService.saveOrderData(orderData);
		return Response.status(Status.OK).entity(orderData).build();
	}

	@Override
	public Response geOrderByEmail(String email) {
		List<OrderData> orderDataList = orderService.getByEmail(email);
		return Response.status(Status.OK).entity(orderDataList).build();
	}

	@Override
	public Response geOrderByOrderId(String orderId) {
		
		OrderData orderData = new OrderData();
		orderService.getOrderByOrderId(orderId, orderData);
		
		return Response.status(Status.OK).entity(orderData).build();
		
	}

	@Override
	public Response updateOrder(OrderData orderData) {
		orderService.saveOrderData(orderData);
		//orderService.updateOrderData(orderData);
		return Response.status(Status.OK).entity(orderData).build();
	}

}
