package com.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class BankingController {

	@GetMapping("/listEmp")
	public String empList() {
		return "myEmployeeList.html";
	}
}
