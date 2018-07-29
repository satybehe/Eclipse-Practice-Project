package playWithJava;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		 String[] arr={"satya","rakesh","Nitesh","rana"};
		 Arrays.sort(arr,new SortClass());
		 for(String s:arr)
		 {
			 System.out.println(s);
		 }
		 
	}

}
class SortClass implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String x=(String)o1;
		String y=(String)o2;
		return x.length()-y.length();
	}
	
}
