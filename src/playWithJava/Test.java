package playWithJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Employee[] emp = new Employee[4];
		emp[0] =new Employee("Satya",23,374.43);
		emp[1] =new Employee("Biky",24,346.43);
		emp[2] =new Employee("Amit",11,344.43);
		emp[3] =new Employee("Nitin",28,340.43);
System.out.println("Enter Sorting Priority:>>");	
		String sci= scn.nextLine();
		if(sci.equals("id"))
		{
			Arrays.sort(emp);
		}
		if(sci.equals("name"))
		{
			Arrays.sort(emp,new newNameComparator());
		}
		if(sci.equals("salary"))
		{
			Arrays.sort(emp, new newSalaryComparator());
		}
		
		for(Employee e: emp)
		{
			System.out.println(e);
		}
		
}
	}

class newNameComparator implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee e1= (Employee) arg0;
		Employee e2= (Employee) arg1;
		
		return e1.name.compareTo(e2.name);
	}
	
}
class newSalaryComparator implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee e1= (Employee) arg0;
		Employee e2= (Employee) arg1;
		
		if(e1.salary>e2.salary)
			return 1;
		else if(e1.salary<e2.salary)
			return -1;
		else 
			return 0;
	}
	
}
