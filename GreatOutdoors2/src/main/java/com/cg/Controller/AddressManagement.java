package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Address;
import com.cg.exceptions.AddressNotFoundException;
import com.cg.service.AddressService;

@RestController
public class AddressManagement {
	@Autowired
	AddressService addresservice;
	
	
	@PostMapping(value="/address/add",consumes = {"application/json"})
	public  String addAddress(@RequestBody Address address)
	{
		addresservice.addAddress(address);
		return "Address added";
	}
	
	
	@GetMapping(value="/address")
	public List<Address> fetchAddress()
	{
		return  addresservice.retreive();
	}
	
	
	@DeleteMapping(value="/address/delete/{id}")
	public String deleteAddress(@PathVariable Long id)
	{
		addresservice.delete(id);
	   return "Address deleted";
	}
	
	
	@RequestMapping(value="/address/update/{id}",consumes= {"application/json"})
	public String updateAddress(@PathVariable Long id,@RequestBody Address address) throws AddressNotFoundException
	{
		Address address1 = addresservice.fingById(id);
		if(address1!=null)
		{
			addresservice.update(id,address);
			return "Address updated";
		}
		else
		{
			throw new 	AddressNotFoundException("Id not exist");
		}
		
		
	}
}
