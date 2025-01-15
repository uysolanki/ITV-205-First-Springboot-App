package com.itv.ITV205FirstSpringbootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itv.ITV205FirstSpringbootApp.model.Customer;
import com.itv.ITV205FirstSpringbootApp.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/first")
	public String welcome()
	{
		return "hello";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer()
	{
		Customer c=new Customer();
		c.setCustEmail("alice@gmail.com");
		c.setCustGender("f");
		c.setCustName("Alice");
		
		customerService.addCustomer(c);
		return "Customer Added Successfully";
	}
}
