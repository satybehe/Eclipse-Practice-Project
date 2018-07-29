package playWithJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	
	public static void main(String[] args) {
		
		Map mp = new HashMap();
		mp.put(100, "Satya");
		mp.put(101, "Biky");
		mp.put(102, "sthita");
		mp.put(103, "yuvi");
		
	//Converting Mp to set
		Set set = mp.keySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			try{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.print("key: "+entry.getKey());
			System.out.print("  ");
			System.out.print("Value: "+entry.getValue());
			System.out.println();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

}
