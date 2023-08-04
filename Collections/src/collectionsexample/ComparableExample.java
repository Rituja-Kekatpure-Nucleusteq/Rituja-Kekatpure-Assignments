package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
    public static void main(String[] args) {
    	ArrayList<Employee> employees = new ArrayList<Employee>();
    	
		Employee employee = new Employee(103,"abc", "Indore");
		Employee employee1 = new Employee(101,"xyz", "Betul");
		Employee employee2 = new Employee(106,"text", "Betul");
		employees.add(employee1);
		employees.add(employee);
		employees.add(employee2);
		
		System.out.println("List Before Sorting: "+employees);
		Collections.sort(employees);
		System.out.println("List After Sorting: "+employees);
		
		
	}
}
