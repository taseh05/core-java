package com.tahaseen.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCls {

	public static void main(String[] args) {
		
		CollectionCls cls = new CollectionCls();
		System.out.println("In Main class:");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(1, 0);
		numbers.add(23);
		numbers.add(13);
		numbers.add(4);
		
		cls.IterableMethodsDemo(numbers);
		cls.CollectionMethodsDemo(numbers);
		cls.queueDemo();
		cls.dequeueDemo();
		
		List<Employee> empList = createEmp();
//		Collections.sort(empList,(a,b)-> Double.compare(a.Salary,b.Salary));
		empList.sort(Comparator.comparing(Employee::getSalary));
		System.out.println("Salary ascending:");
		empList.forEach( System.out::println);
		System.out.println("Salary descending:");
		empList.sort(Comparator.comparing(Employee::getSalary).reversed());
		empList.forEach( System.out::println);
	}

	private static List<Employee>  createEmp() {
		
		List<Employee> empList = Arrays.asList( new Employee("Ravi Kumar", 1001, 45000.0, "Software Engineer"),
			    new Employee("Priya Sharma", 1002, 50000.0, "Senior Software Engineer"),
			    new Employee("Amit Verma", 1003, 65000.0, "Technical Lead"),
			    new Employee("Sneha Reddy", 1004, 40000.0, "QA Engineer"),
			    new Employee("Karthik Rao", 1005, 55000.0, "Business Analyst"),
			    new Employee("Anjali Singh", 1006, 70000.0, "Project Manager"),
			    new Employee("Mohit Gupta", 1007, 38000.0, "Support Engineer"),
			    new Employee("Neha Patel", 1008, 48000.0, "UI Developer"),
			    new Employee("Rahul Mehta", 1009, 60000.0, "DevOps Engineer"),
			    new Employee("Pooja Nair", 1010, 75000.0, "Architect")); 
		 
       return empList;
        
	}

}
