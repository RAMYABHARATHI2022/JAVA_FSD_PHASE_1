package sample;

public class ImmutableExample {

	public static void main(String[] args) {
		String s="Hello";          //string Literal---> object
		String p="Hello";
		if(s.equals(p))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		s.concat("World");
		s=s.concat("World");
		System.out.println(s);
		if(s.equals(p))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		String s4="Truth";     //string pool object
		String s5="Truth";
		//objects are created inside the heap
		String s1=new String("Truth");
		String s2=new String("True");
		String s3=new String("truth");
		
		if((s1.equals(s4))&&(s1.equals(s5)))
		{
			System.out.println("True");
		}
		else if(s2.equals(s3))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
