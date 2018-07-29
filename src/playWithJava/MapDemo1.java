package playWithJava;

import java.util.HashMap;
import java.util.Map;


public class MapDemo1 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(100, "Satya");
		mp.put(101, "Biky");
		mp.put(102, "sthita");
		mp.put(103, "yuvi");
		System.out.println(mp);
		for(Map.Entry m:mp.entrySet())
		{
			System.out.print("Key:"+m.getKey());
			System.out.print("  ");
			System.out.print("Value :"+m.getValue());
			System.out.println();
		}
	}

}
