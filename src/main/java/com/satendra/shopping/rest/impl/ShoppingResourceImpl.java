package com.satendra.shopping.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.satendra.shopping.rest.ShoppingResource;
import com.satendra.shopping.rest.model.ShoppingData;
import com.satendra.shopping.rest.services.ShoppingService;

@Component("shoppingResource")
public class ShoppingResourceImpl implements ShoppingResource {

	@Autowired
	private ShoppingService shoppingService;

	@Override
	public Response getAllProducts() {

		List<ShoppingData> shoppingData = shoppingService.getAllProduct();

		List<List<ShoppingData>> mainShoppingList = new ArrayList<>();

		int j = 4;
		
		for (int i = 0; j < shoppingData.size(); i = i + 4, j = j + 4) {
			List<ShoppingData> shoppingDataSubList = shoppingData.subList(i, j);
			mainShoppingList.add(shoppingDataSubList);
		}
		 j = j-4;
		 
		if(j<shoppingData.size()){
			List<ShoppingData> shoppingDataSubList = shoppingData.subList(j, shoppingData.size());
			mainShoppingList.add(shoppingDataSubList);
			
		}
		return Response.status(Status.OK).entity(mainShoppingList).build();
	}
}
