package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Address;

@Transactional
@Repository
public class AddressDaoImpl implements AddressDaoI {
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Address address) {
		em.persist(address);
		
		
	}

	@Override
	public List<Address> retreive() {
		
			Query q=em.createQuery("from Address s");
			// TODO Auto-generated method stub
			return q.getResultList();
	}

	@Override
	public void delete(Long addressId) {
		Address address = em.find(Address.class, addressId);
		System.out.println(address.getAddressId()+" "+address.getUser().getUserId());
		em.remove(address);	
	}

	@Override
	public Address findById(Long addressId) {
		
		
		return em.find(Address.class, addressId);
	}

	@Override
	public void update(Long addressId,Address address) {
		Address address1 = em.find(Address.class, addressId);
		if(address1!=null)
		{
			address1.setBuildingNo(address.getBuildingNo());
			address1.setCity(address.getCity());
			address1.setFeild(address.getFeild());
			address1.setState(address.getState());
			address1.setZip(address.getZip());
			
		}
		
	}

}
