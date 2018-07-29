package practice2;

import java.util.ArrayList;
import java.util.Iterator;





public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		for(int i=0;i<=	10;i++){
			al.add(i);
		
		}
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			int i=(int) itr.next();
			
			if (i%2!=0) {
				itr.remove();
				
			}
		}
		System.out.println();
		System.out.println(al);
		
	}

}
