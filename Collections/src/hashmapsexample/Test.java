package hashmapsexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "abc");
		map.put(101, "xyz");
		map.put(103, "text");
		map.put(167, "satt");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("Enter the name to be checked");
		String str = scanner.next();
		for (Entry<Integer, String> entry : map.entrySet()) {

			if (entry.getValue().contains(str)) {
				System.out.println("The key for value " + str + " is " + entry.getKey());
				break;
			}

		}
		System.out.println("Removing a name:" + map.remove(103));
		System.out.println("Updating a name:" + map.put(101, "xysd"));
		System.out.println("Getting a value:" + map.get(101));

		System.out.println("Enter the value of key");
		int key = scanner.nextInt();
		System.out.println("Map contains the given key :" + map.containsKey(key));

		System.out.println("Enter the value to check it is present or not");
		String value = scanner.next();
		System.out.println("Contains the given value :" + map.containsValue(value));

		System.out.println("Iterating Hashmap...");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

	}
}
