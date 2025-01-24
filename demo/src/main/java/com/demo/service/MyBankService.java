package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.MyBankDAOInterface;
import com.demo.entity.Employee;

@Service
@Transactional
public class MyBankService implements MyBankServiceInterface {

	@Autowired
	private MyBankDAOInterface bankDaoInterface;

	@Override
	public Employee createProfileService(Employee emp) {
		bankDaoInterface.save(emp);
		return emp;
	}

	@Override
	public List<Employee> displayProfileService() {
		return bankDaoInterface.findAll();

	}

	@Override
	public Employee updateProfileService(Employee emp) {
		return bankDaoInterface.saveAndFlush(emp);
	}

	@Override
	public void deleteProfileService(String email) {
		bankDaoInterface.deleteById(email);
	}

}