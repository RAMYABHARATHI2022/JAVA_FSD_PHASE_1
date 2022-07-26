package sample;

public class StringMethod {

	public static void main(String[] args) {
		String s1="PROGRAMMING";  
		String s2="java";  
				
		System.out.println(s1.equals(s2));   //true because content and case is same  
				
		System.out.println("string length is: "+s1.length());    
		System.out.println("string length is: "+s2.length());     
			
		String name="JAVAPROGRAM";  
		String ch=name.substring(0,8); //returns the char value at the 4th index  
		System.out.println(ch);  
		
		String s1lower=s1.toLowerCase();  
		System.out.println(s1lower);            // converts to lowercase
		
		String s1upper=s2.toUpperCase();  
		System.out.println(s1upper);            
	}
}
