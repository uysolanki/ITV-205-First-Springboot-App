package com.itv.ITV205FirstSpringbootApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itv.ITV205FirstSpringbootApp.model.Customer;
import com.itv.ITV205FirstSpringbootApp.service.CustomerService;

@Controller
@RequestMapping("/blinkit/v1")
public class CustomerControllerForFE {

	@Autowired
	CustomerService customerService;

	@RequestMapping("/register")
	public String register(Model model) {
		Customer c=new Customer();
		model.addAttribute("mycust",c);
		return "customer-registration-form";
	}

	
	@PostMapping("/addCustomerByRequestBody")
	public String addCustomerByRequestBody(@ModelAttribute Customer customer) {
		customerService.addCustomer(customer);
		return "redirect:/blinkit/v1/homepage";
	}

	
	@GetMapping("/homepage")
	public String getAllCustomers(Model model) {
		List<Customer> customers= customerService.getAllCustomers();
		model.addAttribute("customers",customers);
		return "customer-list";
	}
	
	@GetMapping("/getCustomer/{custid}")
	public Customer getCustomer(@PathVariable("custid") int cid) {
		return customerService.getCustomer(cid);
	}
	
	@PutMapping("/updateCustomer/{custid}")
	public Customer updateCustomer(@PathVariable("custid") int cid,@RequestBody Customer newValues) {
		return customerService.updateCustomer(cid,newValues);
	}
	
	@DeleteMapping("/deleteCustomer/{custid}")
	public String deleteCustomer(@PathVariable("custid") int cid) {
		customerService.deleteCustomer(cid);
		return "Record Deleted Successfully";
	}
}
