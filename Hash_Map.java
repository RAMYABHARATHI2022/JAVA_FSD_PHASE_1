package assistedpracticeproject;

import java.util.*;

public class Hash_Map 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm1 = new HashMap<>();
		// Initialization of a HashMap using Generic
        HashMap<Integer, String> hm2= new HashMap<Integer, String>();
  
        // Adding elements using put method
        hm1.put(1, "twenty one");
        hm1.put(2, "twenty two");
        hm1.put(3, "twenty three");
  
        hm2.put(4, "twenty four");
        hm2.put(5, "twenty five");
        hm2.put(6, "twenty six");
  
        // Print and display mapping of HashMap 1
        System.out.println("Mappings of HashMap hm1 are : "
                           + hm1);
  
        // Print and display mapping of HashMap 2
        System.out.println("Mapping of HashMap hm2 are : "
                           + hm2);
	}
}
