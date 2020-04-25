package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.Dao.AddressDaoI;
import com.cg.Dao.UserDaoI;
import com.cg.entity.Address;
import com.cg.entity.User;

@SpringBootApplication
public class GreatOutdoors2Application   {
	@Autowired
	AddressDaoI addressdao;
	
	@Autowired
	UserDaoI userdao;

	public static void main(String[] args) {
		SpringApplication.run(GreatOutdoors2Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
//		User user1 = new User();
//		Address address1 = new Address();
//		
////		user1.setEmail("naveennovell143@gmail.com");
////		user1.setPassword("dinesh123");
////		user1.setPhoneNumber("9133131345");
////		user1.setUserId(101l);
////		user1.setUserName("naveennovell");
////		user1.setRole("1");
////		address1.setUser(user1);
////		
////		userdao.create(user1);
//		
////		address1.setAddressId(1l);
////		address1.setBuildingNo("6-32");
////		address1.setCity("ibrahimpatan");
////		address1.setFeild("hr");
////		address1.setState("telangana");
////		address1.setZip("501508");
////		
////		
////		addressdao.create(address1);
		
		
	
		

}
