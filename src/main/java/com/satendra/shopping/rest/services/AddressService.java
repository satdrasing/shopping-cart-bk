package com.satendra.shopping.rest.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satendra.shopping.rest.dao.AddressRepository;
import com.satendra.shopping.rest.entity.AddressEntity;
import com.satendra.shopping.rest.model.AddressData;

@Service
@Transactional
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public List<AddressData> getAllAddress() {

		Iterable<AddressEntity> addressEntityList = addressRepository.findAll();

		List<AddressData> addressDataList = new ArrayList<>();

		for (AddressEntity addressEntity : addressEntityList) {

			AddressData addressData = new AddressData();

			BeanUtils.copyProperties(addressEntity, addressData);
			addressDataList.add(addressData);

		}
		return addressDataList;
	}

	public List<AddressData> getAddressByEmail(String email) {

		List<AddressData> addressDataList = new ArrayList<>();

		List<AddressEntity> addressEntityList = addressRepository.getAddressbyEmail(email);

		for (AddressEntity addressEntity : addressEntityList) {
			AddressData addressData = new AddressData();
			BeanUtils.copyProperties(addressEntity, addressData);
			addressDataList.add(addressData);
		}

		return addressDataList;

	}

	public void saveAddressData(AddressData addressData) {
		AddressEntity addressEntity = new AddressEntity();
		BeanUtils.copyProperties(addressData, addressEntity);
		addressRepository.save(addressEntity);
	}

	public void deleteAddressbyid(String id) {
		addressRepository.delete(Integer.parseInt(id));
	}
	
	public void getAddressByid(String id, AddressData addressData){
		AddressEntity addressEntity =  addressRepository.findOne(Integer.parseInt(id));
		BeanUtils.copyProperties(addressEntity, addressData);
	}

}
