package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
    public static void main(String[] args) {
ArrayList<Employee> employees = new ArrayList<Employee>();
    	
		Employee employee = new Employee(103,"aBC", "Indore");
		Employee employee1 = new Employee(11,"XYZ", "Betul");
		Employee employee2 = new Employee(18,"tXT", "Sarni");
		employees.add(employee1);
		employees.add(employee);
		employees.add(employee2);
		
		System.out.println("List Before Sorting: "+employees);
		Collections.sort(employees,new NameComparator());
		System.out.println("List After Sorting by Name: "+employees);
		
		Collections.sort(employees,new IdComparator());
		System.out.println("List After Sorting by Id: "+employees);

	}
}
