package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.AddressDaoI;
import com.cg.entity.Address;
import com.cg.entity.User;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddressDaoI addressdao;

	@Override
	public void addAddress(Address address) {
		User user1 = new User();
		Address address1 = new Address();
		
		user1.setEmail("naveennovell143@gmail.com");
		user1.setPassword("dinesh123");
		user1.setPhoneNumber("9133131345");
		user1.setUserId(101l);
		user1.setUserName("naveennovell");
		user1.setRole("1");
		address1.setUser(user1);
		addressdao.create(address1);
		
		
	}

	@Override
	public List<Address> retreive() {
		
		return addressdao.retreive();
	}

	@Override
	public void delete(Long addressId) {
		addressdao.delete(addressId);
		
	}

	@Override
	public void update(Long addressId,Address address) {
		addressdao.update(addressId,address);
		
	}

	@Override
	public Address fingById(Long addressId) {
		return addressdao.findById(addressId);
	}

	

}
