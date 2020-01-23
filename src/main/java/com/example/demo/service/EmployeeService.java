package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Employee;

@Component
public class EmployeeService {

	public Employee addEmployee(Employee employee) {
		Employee resp = new Employee(1, "Mike", "Akopov", 1000);
		return resp;
	}

}
