package hashmapsexample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "abc");
		map.put(103, "xyz");
		map.put(105, "txt");
		map.put(108, "abd");
		System.out.println(map);

		map.remove(103);
		System.out.println("After removing value on key 103:  "+map);

		// key
		System.out.println("Keys: " + map.keySet());
		// value
		System.out.println("Values: " + map.values());
		// key-value pair
		System.out.println("Key-Value pairs: " + map.entrySet());
		
		System.out.println("Size of map: "+map.size());
		
		System.out.println("Checking value is present or not ");
		System.out.println("value xyz is available: "+map.containsValue("xyz"));

	}
}
