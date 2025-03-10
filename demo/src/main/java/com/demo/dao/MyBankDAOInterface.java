package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Employee;

@Repository
public interface MyBankDAOInterface extends JpaRepository<Employee, String> {

}