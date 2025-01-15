package com.itv.ITV205FirstSpringbootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itv.ITV205FirstSpringbootApp.model.Customer;
import com.itv.ITV205FirstSpringbootApp.repository.CustomerRespository;

@Service
public class CustomerService {

	@Autowired
	CustomerRespository customerRespository;
	public void addCustomer(Customer c) {
		customerRespository.save(c);
		
	}

}
