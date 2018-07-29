package playWithJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo1 {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("satya");
		al.add("biky");
		al.add("dillip");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("satya");
		al1.add("kisan");
		al1.add("sthita");
		Iterator itr =al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al);
		System.out.println(al1);
		

	}
	}
	
	