package com.demo.service;

import java.util.List;

import com.demo.entity.Employee;

public interface MyBankServiceInterface {
	Employee createProfileService(Employee emp);

	List<Employee> displayProfileService();

	Employee updateProfileService(Employee emp);

	void deleteProfileService(String email);
}
