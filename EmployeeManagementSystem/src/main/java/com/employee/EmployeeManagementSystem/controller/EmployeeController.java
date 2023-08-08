package com.employee.EmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EmployeeManagementSystem.entity.Employee;
import com.employee.EmployeeManagementSystem.service.EmployeeService;
import com.employee.EmployeeManagementSystem.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeServiceImpl;

	@PostMapping("/saveEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
		try { 
			return new ResponseEntity<>(employeeServiceImpl.saveEmployee(employee), HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@GetMapping("/")
	public ResponseEntity<?> getAllEmployee() {
		
		List<Employee> list = employeeServiceImpl.getAllEmployee();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Integer id) {
		 Employee employee = employeeServiceImpl.getEmployeeById(id);
		if(employee==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(employeeServiceImpl.deleteEmployee(id), HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}

	@PutMapping("/editEmployee/{id}")
	public ResponseEntity<?> editEmployee(@RequestBody Employee employee, @PathVariable Integer id) {
		try {
		return new ResponseEntity<>(employeeServiceImpl.editEmployee(employee, id), HttpStatus.CREATED);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
