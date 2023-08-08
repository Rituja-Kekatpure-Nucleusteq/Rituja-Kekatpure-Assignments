package com.employee.EmployeeManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeManagementSystem.Entity.Employee;
import com.employee.EmployeeManagementSystem.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee); 
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Employee employee= null;
		try {
		employee= employeeRepository.findById(id).get();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public String deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> e = employeeRepository.findById(id);
		 Employee employee = e.get();
		 if(employee != null)
		 {
			 employeeRepository.delete(employee);
			 return "Employee deleted Successfully";
		 }
		 return "Employee Went Wrong";
	}

	@Override
	public Employee editEmployee(Employee employee, Integer id) {
		// TODO Auto-generated method stub
		Employee oldemployee = employeeRepository.findById(id).get();
		oldemployee.setName(employee.getName());
		oldemployee.setEmail(employee.getEmail());
		
		return employeeRepository.save(oldemployee);
	
	}
	
}
