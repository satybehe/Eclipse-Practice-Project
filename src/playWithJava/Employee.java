package playWithJava;

import java.util.Scanner;

public class Employee implements Comparable{
	String name;
	int id;
	double salary;
	
	public Employee(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String toString()
	{
		return "Name: "+name+"id: "+id+"Salary: "+salary;
	}
	public int compareTo(Object x) {
		return id-((Employee)x).id;
		
	}
}
