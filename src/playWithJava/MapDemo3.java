package playWithJava;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
	
	int number;
	String bookName,author;
	
	public MapDemo3(int number,String bookName,String author) {
		this.number=number;
		this.bookName=bookName;
		this.author=author;
	}
	
	public static void main(String[] args) {
		Map<Integer,MapDemo3> mp = new HashMap<Integer,MapDemo3>();
		MapDemo3 md1= new MapDemo3(101, "Java", "Kathy");
		MapDemo3 md2= new MapDemo3(102, "Physics", "HC Verma");
		MapDemo3 md3= new MapDemo3(103, "Maths", "RD Sharma");
		mp.put(1, md1);
		mp.put(2, md2);
		mp.put(3, md3);
		System.out.println(mp);
		
		for (Map.Entry m:mp.entrySet()) {
			int key=(int) m.getKey();
			MapDemo3 md=(MapDemo3) m.getValue();
			System.out.print("key: "+key);
			System.out.print(" , ");
			System.out.println("Book ID:"+md.number+" "+"Book Name: "+md.bookName+" "+"Author: "+md.author);
			System.out.println();
		}
	}

}
