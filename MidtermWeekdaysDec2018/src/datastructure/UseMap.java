package datastructure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Demonstrate how to use Map that includes storing and retrieving elements.
 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
 * Use For Each loop and while loop with Iterator to retrieve data.
 *
 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
 */

	class UseMap
	{
		// Generic function to convert Map<K,V> to a List of <Map.Entry<K,V>
		public static<K,V> List<Map.Entry<K,V>> convertToList(Map<K,V> map)
		{
			return map.entrySet()
					.stream()
					.collect(Collectors.toList());
		}

		// Program to convert Map to a List in Java 8
		public static void main (String[] args)
		{
			Map<String, Integer> asciiMap = new HashMap<>();

			asciiMap.put("A", 65);
			asciiMap.put("B", 66);
			asciiMap.put("C", 67);

			// list to store mappings
			List<Map.Entry<String, Integer>> entries = convertToList(asciiMap);

			System.out.println(entries);
		}
	}
