package com.api_consumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/v1/consumer")
public class ConsumerController {

	@GetMapping
	public List<Employee> consumeAllEmployeesFromProducer() {

	}

}
