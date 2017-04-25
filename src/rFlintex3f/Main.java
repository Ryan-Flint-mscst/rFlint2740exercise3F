package rFlintex3f;

public class Main {

	public static void main(String[] args) {
        // --------------------------------------------------
        // Employee 1: Susan Meyers
        // --------------------------------------------------
		Employee emp1 = new Employee();
		emp1.setIdNumber(47899);
		emp1.setName("Susan Meyers");
		emp1.setDepartment("accounting;");
		emp1.setPosition("Vice President;");
		
		System.out.println("Emp1 ");
		System.out.println("\t" + emp1.getIdNumber());
		System.out.println("\t" + emp1.getName());
		System.out.println("\t" + emp1.getDepartment());
		System.out.println("\t" + emp1.getPosition());
	}
	{
	// ------------------------------------------------------
	// Employee 2: Mark Jones
	// ------------------------------------------------------
	Employee emp2 = new Employee();
	emp2.setIdNumber(39119);
	emp2.setName("Mark Jones");
	emp2.setDepartment("IT");
	emp2.setPosition("Programmer");
	
	System.out.println("Emp2 ");
	System.out.println("\t" + emp2.getIdNumber());
	System.out.println("\t" + emp2.getName());
	System.out.println("\t" + emp2.getDepartment());
	System.out.println("\t" + emp2.getPosition());
	}
	{
	// ------------------------------------------------------
	// Employee 3: Joy Rodgers
	// ------------------------------------------------------
	Employee emp3 = new Employee();
	emp3.setIdNumber(81774);
	emp3.setName("Joy Rodgers");
	emp3.setDepartment("Manufacturing");
	emp3.setPosition("Engineer");
	
	System.out.println("Emp3 ");
	System.out.println("\t" + emp3.getIdNumber());
	System.out.println("\t" + emp3.getName());
	System.out.println("\t" + emp3.getDepartment());
	System.out.println("\t" + emp3.getPosition());
	}
}