package com.itv.ITV205FirstSpringbootApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@RequestMapping("/first")
	public String welcome()
	{
		return "hello";
	}
}
