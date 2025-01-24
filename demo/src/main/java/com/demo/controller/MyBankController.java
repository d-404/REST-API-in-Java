package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.MyBankServiceInterface;

@RestController
@RequestMapping("/api/v1/emp")
public class MyBankController {

	@Autowired
	MyBankServiceInterface myBankServiceInterface;

	@GetMapping
	public List<Employee> displayProfile() {
		return myBankServiceInterface.displayProfileService();
	}

	@PostMapping
	// fetching data from Postman
	public String createProfile(@RequestBody Employee employee) {
		Employee emp = myBankServiceInterface.createProfileService(employee);
		System.out.println(emp.toString());
		return "Registered successfully => " + "Name : " + employee.getName() + ", Email : " + employee.getEmail()
				+ ", Address : " + employee.getAddress();
	}

	@PutMapping("/{uid}")
	public Employee updateProfile(@PathVariable("uid") String uidEmail, @RequestBody Employee emp) {
		return myBankServiceInterface.updateProfileService(emp);
	}

	@DeleteMapping("/{uid}")
	// uid variable is passed by postman
	public void deleteProfile(@PathVariable("uid") String uidEmail) {
		myBankServiceInterface.deleteProfileService(uidEmail);
	}
}