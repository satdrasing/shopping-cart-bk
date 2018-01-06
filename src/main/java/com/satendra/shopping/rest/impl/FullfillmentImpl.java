package com.satendra.shopping.rest.impl;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.satendra.shopping.rest.FullfillmentResource;
import com.satendra.shopping.rest.model.FullfillmentData;
import com.satendra.shopping.rest.services.FullFillmentService;

@Component("fullfillmentResource")
public class FullfillmentImpl  implements FullfillmentResource{
	
	@Autowired
	private FullFillmentService fullfillmentService;

	@Override
	public Response getAllFillfillments(String orderid) {
		List<FullfillmentData> fullmentDataList =  fullfillmentService.getAllFullfillmentOrderBiOrderId(orderid);
		return Response.status(Status.OK).entity(fullmentDataList).build();
	}

	@Override
	public Response saveFillfillments(List<FullfillmentData> fullfillmentDataList) {
		
		System.err.println(fullfillmentDataList);
		fullfillmentService.saveAllFullRecord(fullfillmentDataList);
		
		for (FullfillmentData fullfillmentData : fullfillmentDataList) {
			System.err.println(fullfillmentData.getOrderId());
			System.err.println(fullfillmentData.getProductName());
		}
		
		return Response.status(Status.OK).entity(fullfillmentDataList).build();
		
	}

	@Override
	public Response getAllFillfill() {
		List<FullfillmentData> fullfillmentData =fullfillmentService.getAllFullFillments();
		return Response.status(Status.OK).entity(fullfillmentData).build();
	}

}
