package com.itv.ITV205FirstSpringbootApp.service;

import java.util.List;
import java.util.Optional;

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
	public List<Customer> getAllCustomers() {
		return customerRespository.findAll();
	}
	
	public Customer getCustomer(int cid) {
		Optional<Customer> optCustomer=customerRespository.findById(cid);
		Customer customer=null;
		if(optCustomer.isPresent())
		{
			customer=optCustomer.get();
		}
		return customer;
	}
	public List<Customer> addMultipleCustomers(List<Customer> customers) {
		return customerRespository.saveAll(customers);
	}
	public Customer updateCustomer(int cid, Customer newValues) {
		Customer dbValues=getCustomer(cid);
		dbValues.setCustEmail(newValues.getCustEmail());
		dbValues.setCustName(newValues.getCustName());
		return customerRespository.save(dbValues);
	}
	public void deleteCustomer(int cid) {
		customerRespository.deleteById(cid);
		
	}

}
