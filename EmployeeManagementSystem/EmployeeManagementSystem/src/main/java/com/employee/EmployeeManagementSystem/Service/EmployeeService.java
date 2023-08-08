package com.employee.EmployeeManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.EmployeeManagementSystem.Entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(Integer id);
	
	public String deleteEmployee(Integer id);
	
	public Employee editEmployee(Employee employee,Integer id);
	
	
}
