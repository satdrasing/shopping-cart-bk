package com.satendra.shopping.rest.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satendra.shopping.rest.dao.OrderRepository;
import com.satendra.shopping.rest.entity.OrderEntity;
import com.satendra.shopping.rest.model.OrderData;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Transactional
	public void saveOrderData(OrderData orderData) {
		OrderEntity orderEntity = new OrderEntity();
		BeanUtils.copyProperties(orderData, orderEntity);
		orderRepository.save(orderEntity);
	}

	@Transactional
	public List<OrderData> getByEmail(String email) {
		List<OrderEntity> orderEntityList = orderRepository.findbyEmail(email);

		List<OrderData> orderDataList = new ArrayList<>();

		for (OrderEntity orderEntity : orderEntityList) {
			OrderData orderData = new OrderData();
			BeanUtils.copyProperties(orderEntity, orderData);
			orderDataList.add(orderData);
		}
		Collections.sort(orderDataList);

		return orderDataList;
	}

	@Transactional
	public void getOrderByOrderId(String OrderId, OrderData orderData) {
		OrderEntity orderEntity = orderRepository.findOne(OrderId);

		BeanUtils.copyProperties(orderEntity, orderData);

	}

	@Transactional
	public void updateOrderData(OrderData orderData) {

		OrderEntity orderEntity = orderRepository.findOne(orderData.getOrderID());
		orderEntity.setOrderShipped(orderData.getOrderShipped());
		orderRepository.save(orderEntity);
	}
}
