package com.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankingController {

	@GetMapping("listEmp")
	public String empList() {
		return "myEmployeeList.html";
	}
}
