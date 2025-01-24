package com.api_consumer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api_consumer.dto.Employee;

@RestController
@RequestMapping("/api/v1/consumer")
public class ConsumerController {

	@GetMapping
	public List<Employee> consumeAllEmployeesFromProducer() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:8080/api/v1/emp", List.class);
	}

	@PostMapping
	public String createProfileConsumer(@RequestBody Employee employee) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject("http://localhost:8080/api/v1/emp", employee, String.class);
	}

	@PutMapping("/{uid}")
	public void updateProfileConsumer(@PathVariable("uid") String uidEmail, @RequestBody Employee employee) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put("http://localhost:8080/api/v1/emp/" + uidEmail, employee, String.class);
		System.out.println("Updated record consumed successfully");
	}

	@DeleteMapping
	public void deleteProfileConsumer(@PathVariable("uid") String uidEmail) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:8080/api/v1/emp/" + uidEmail);
	}
}
