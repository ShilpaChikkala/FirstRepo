package JavaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put("A", "Tom");
		h.put("B", "Peter");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		
		System.out.println(h.get("B"));
		
		
		
		
		
		
		
	}

}
