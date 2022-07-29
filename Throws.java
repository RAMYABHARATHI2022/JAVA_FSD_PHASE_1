package assistedpracticeproject;

import java.io.*;
import java.util.Scanner;

public class Throws 
{
	public int display(int x,int y) throws IOException
	{
		if(x>y)
		{
			throw new IOException("Bigger");
		}
		else
		{
			System.out.println("Both values are correct");
		}
		return x*y;
	}
	void area_fun(int l,int b)
	{
		int result=0;
		try
		{
			result=display(l,b);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) 
	{
		Throws t=new Throws();
		Scanner sc=new Scanner(System.in);
		int result=0;
		System.out.println("Enter first value: ");
		int x=sc.nextInt();
		System.out.println("Enter second value: ");
		int y=sc.nextInt();
		
		t.area_fun(x,y);
		System.out.println(result);
		sc.close();
	}
}
