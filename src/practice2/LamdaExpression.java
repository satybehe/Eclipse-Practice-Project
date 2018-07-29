/**
 * 
 */
package practice2;

import java.awt.List;
import java.util.ArrayList;

/**
 * @author Satya
 *
 */
public class LamdaExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for(char c = 'a'; c <= 'z'; c++){
			
			arrayList.add(c+"");
			
		}
		
		/*System.out.println(arrayList);
		
		for( String s : arrayList){
			System.out.println(s);
		}*/
		
		arrayList.forEach(
				
				(n)-> System.out.println(n)
				
				);
		

	}

}
