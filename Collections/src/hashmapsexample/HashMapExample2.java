package hashmapsexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of capacity");
		int capacity = scanner.nextInt();
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("Enter key value pair data");
		for (int i = 0; i < capacity; i++) {
			map.put(scanner.nextInt(), scanner.next());

		}

		System.out.println(map);

		System.out.println("Clearing map on a spcified condition");
		System.out.println("Enter the  limit");
		int limit = scanner.nextInt();
		for (int i = 0; i < map.size(); i++) {
			if (map.size() > limit) {
				map.clear();
			}
		}
		System.out.println("Checking if map is empty: " + map.isEmpty());

		System.out.println("Enter new capacity to add the data");
		int new_capacity = scanner.nextInt();
		System.out.println("Enter key value pair data");
		for (int i = 0; i < new_capacity; i++) {
			map.put(scanner.nextInt(), scanner.next());

		}

		System.out.println(map);
	}

}
