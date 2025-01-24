//package com.itv.ITV205FirstSpringbootApp.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.itv.ITV205FirstSpringbootApp.model.Customer;
//import com.itv.ITV205FirstSpringbootApp.service.CustomerService;
//
//@RestController
//@RequestMapping("/blinkit/v1")
//public class CustomerControllerForPostman {
//
//	@Autowired
//	CustomerService customerService;
//
//	@RequestMapping("/first")
//	public String welcome() {
//		return "hello";
//	}
//
//	@PostMapping("/addCustomer")
//	public String addCustomer() {
//		Customer c = new Customer();
//		c.setCustEmail("alice@gmail.com");
//		c.setCustGender("f");
//		c.setCustName("Alice");
//		customerService.addCustomer(c);
//		return "Customer Added Successfully";
//	}
//
//	@PostMapping("/addCustomerByRequestParam")
//	public String addCustomerByRequestParam(@RequestParam("a") String email, @RequestParam("b") String gen,
//			@RequestParam("c") String name) {
//		Customer c = new Customer();
//		c.setCustEmail(email);
//		c.setCustGender(gen);
//		c.setCustName(name);
//		customerService.addCustomer(c);
//		return "Customer Added Successfully";
//	}
//
//	@PostMapping("/addCustomerByRequestBody")
//	public Customer addCustomerByRequestBody(@RequestBody Customer customer) {
//		return customerService.addCustomer(customer);
//	}
//	
//	@PostMapping("/addMultipleCustomers")
//	public List<Customer> addMultipleCustomers(@RequestBody List<Customer> customers) {
//		return customerService.addMultipleCustomers(customers);
//	}
//	
//	@GetMapping("/getAllCustomers")
//	public List<Customer> getAllCustomers() {
//		return customerService.getAllCustomers();
//	}
//	
//	@GetMapping("/getCustomer/{custid}")
//	public Customer getCustomer(@PathVariable("custid") int cid) {
//		return customerService.getCustomer(cid);
//	}
//	
//	@PutMapping("/updateCustomer/{custid}")
//	public Customer updateCustomer(@PathVariable("custid") int cid,@RequestBody Customer newValues) {
//		return customerService.updateCustomer(cid,newValues);
//	}
//	
//	@DeleteMapping("/deleteCustomer/{custid}")
//	public String deleteCustomer(@PathVariable("custid") int cid) {
//		customerService.deleteCustomer(cid);
//		return "Record Deleted Successfully";
//	}
//}
