package selfDsaPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class FrequencyCountHashMap {

	public static void main(String[] args) {
		
		int ar[] = {1,5,5,5,2,8,2,7,3};

		
		HashMap<Integer,Integer> h = new HashMap<>();
		
		for(int i = 0; i<ar.length; i++) {
			
			if(h.containsKey(ar[i])) {
				h.replace(ar[i], h.get(ar[i])+1);
			}else {
				h.put(ar[i], 1);
			}
		}
		
		
		
		
		Set<Integer> arr = h.keySet();
		Collection<Integer> c = h.values();
		
	    
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(int i : c) {
			System.out.print(i + " ");
		}
		
		
		
	}

}
