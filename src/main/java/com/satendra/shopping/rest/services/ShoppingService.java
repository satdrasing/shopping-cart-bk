package com.satendra.shopping.rest.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satendra.shopping.rest.dao.ShoppingRespository;
import com.satendra.shopping.rest.entity.ShoppingEntity;
import com.satendra.shopping.rest.model.ShoppingData;

@Service
public class ShoppingService {

	@Autowired
	private ShoppingRespository shoppingRespository;

	@Transactional
	public List<ShoppingData> getAllProduct() {

		List<ShoppingData> shoppingDataList = new ArrayList<>();
		List<ShoppingEntity> shoppingEntitylist = new ArrayList<>();

		Iterable<ShoppingEntity> productList = shoppingRespository.findAll();
		productList.forEach(shoppingEntitylist::add);

		for (ShoppingEntity shoppingEntity : shoppingEntitylist) {

			ShoppingData sd = new ShoppingData();
			sd.setId(shoppingEntity.getId());
			sd.setCategory(shoppingEntity.getCategory());
			sd.setCost(shoppingEntity.getCost());
			sd.setDescription(shoppingEntity.getDescription());
			sd.setImage(shoppingEntity.getImage());
			sd.setProductId(shoppingEntity.getProductId());
			sd.setProductName(shoppingEntity.getProductName());

			shoppingDataList.add(sd);

		}
		
		return shoppingDataList;

	}
}
