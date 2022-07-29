package assistedpracticeproject;

import java.util.*;

public class Tree_Map 
{
	static void Constructor()
    {
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map= new TreeMap<Integer, String>();
        // Mapping string values to int keys
        // using put() method
        tree_map.put(10, "Hello");
        tree_map.put(15, "World");
        tree_map.put(20, "Chess");
        tree_map.put(25, "Olympic");
        tree_map.put(30, "2022");
        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }
	public static void main(String[] args) 
	{
		System.out.println("TreeMap using TreeMap() constructor: ");
			// Calling constructor
		Constructor();
	}
}
