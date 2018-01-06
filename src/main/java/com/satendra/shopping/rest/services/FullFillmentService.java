package com.satendra.shopping.rest.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satendra.shopping.rest.dao.FullfillmentRepository;
import com.satendra.shopping.rest.entity.FullfillmentEntity;
import com.satendra.shopping.rest.model.FullfillmentData;

@Service
@Transactional
public class FullFillmentService {

	@Autowired
	private FullfillmentRepository fullfillmentRepository;

	public List<FullfillmentData> getAllFullfillmentOrderBiOrderId(String orderId) {

		List<FullfillmentData> fullfillmentDataList = new ArrayList<>();

		List<FullfillmentEntity> fullfillmentList = fullfillmentRepository.getAllRecordByOrderId(orderId);

		for (FullfillmentEntity fullfillmentEntity : fullfillmentList) {
			FullfillmentData fullfillmentData = new FullfillmentData();
			BeanUtils.copyProperties(fullfillmentEntity, fullfillmentData);
			fullfillmentDataList.add(fullfillmentData);
		}
		return fullfillmentDataList;
	}

	public void saveAllFullRecord(List<FullfillmentData> fullFillmentDataList) {

		for (FullfillmentData fullfillmentData : fullFillmentDataList) {
			
			FullfillmentEntity fullfillmentEntity = new FullfillmentEntity();
			
			BeanUtils.copyProperties(fullfillmentData, fullfillmentEntity);
			
			fullfillmentRepository.save(fullfillmentEntity);
		}

	}

}
