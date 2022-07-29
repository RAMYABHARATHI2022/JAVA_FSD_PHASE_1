package assistedpracticeproject;

import java.util.Scanner;

public class Throws_exception 
{
	static int area(int a,int b)
	{
		if(a>900)
		{
			throw new ArithmeticException("Bigger");
		}
		else
		{
			System.out.println("Smaller");
		}
		return a*b;
	}
	public static void main(String[] args) 
	{
		double result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a=sc.nextInt();
		System.out.println("Enter b value: ");
		int b=sc.nextInt();
		
		try
		{
			result=area(a,b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(result);
		sc.close();
	}
}