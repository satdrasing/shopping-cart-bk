package com.satendra.shopping.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.satendra.shopping.rest.AddressResource;
import com.satendra.shopping.rest.model.AddressData;
import com.satendra.shopping.rest.services.AddressService;

@Component("addressResource")
public class AddressResourceImpl implements AddressResource {

	@Autowired
	private AddressService addressService;

	@Override
	public Response getAllAddress() {
		List<AddressData> addressData = addressService.getAllAddress();
		return Response.status(Status.OK).entity(addressData).build();

	}

	@Override
	public Response getAddressEmail(String email) {

		List<List<AddressData>> addressMasterList = new ArrayList<>();

		List<AddressData> addressDataList = addressService.getAddressByEmail(email);

		int j = 4;

		for (int i = 0; j <= addressDataList.size(); i = i + 4, j = j + 4) {
			List<AddressData> addressDataSubList = addressDataList.subList(i, j);
			addressMasterList.add(addressDataSubList);
		}

		j = j - 4;

		if (j < addressDataList.size()) {
			List<AddressData> addressDataSubList = addressDataList.subList(j, addressDataList.size());
			addressMasterList.add(addressDataSubList);
		}

		return Response.status(Status.OK).entity(addressMasterList).build();
	}

	@Override
	public Response saveAddress(AddressData addressData) {
		addressService.saveAddressData(addressData);
		return Response.status(Status.OK).entity(addressData).build();
	}

	@Override
	public Response updateAddress(AddressData address) {
		return null;
	}

	@Override
	public Response deleteAddressById(String id) {
		addressService.deleteAddressbyid(id);
		return Response.status(Status.OK).entity(id).build();
	}

	@Override
	public Response getAddressById(String id) {
		AddressData addressData = new AddressData();
		addressService.getAddressByid(id, addressData);
		return Response.status(Status.OK).entity(addressData).build();
	}

}
