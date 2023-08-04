package hashmapsexample;

import java.util.Map;
import java.util.TreeMap;

public class TreesetExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "A");
		map.put(102, "B");
		map.put(101, "C");
		map.put(103, "D");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.remove(103);
		System.out.println("After deleting data");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// descending order
		System.out.println("Map in descending order: " + map.descendingMap());

		System.out.println("descendingMap: " + map.firstKey());

		System.out.println("descendingMap: " + map.lastKey());
	}
}
