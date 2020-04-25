package com.cg.service;

import java.util.List;

import com.cg.entity.Address;

public interface AddressService {
	public void addAddress(Address address);
	public List<Address> retreive();
	public void delete(Long addressId);
	public Address fingById(Long addressId);
	public void update(Long addressID,Address address);

}
