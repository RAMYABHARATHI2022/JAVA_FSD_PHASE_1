package sample;

public class String_Pool {

	public static void main(String[] args) 
	{
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		//o with l
		if(o.equals(l)) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		if(o==l) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		// y with p
		if(y.equals(p)) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		if(y==p)
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		//t with o
		if(t.equals(o)) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		if(t==o) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		//k with y
		if(k.equals(y)) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		if(k==y) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		//p with y
		if(p.equals(y)) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
		if(p==y) 
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
	}
}
