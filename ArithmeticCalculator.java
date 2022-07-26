package practiceproject;

import java.util.Scanner;

public class ArithmeticCalculator 
{
	public static void main(String[] args) 
	{
		double num1, num2, result=0;
		Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the first numbers :");
        num1 = sc.nextDouble();
        System.out.println("Enter the second numbers :");
        num2 = sc.nextDouble();
  
        System.out.println("Enter the operator (+,-,*,/) :");
        char operator = sc.next().charAt(0);
  
        switch (operator) 
        {
        	case '+':
          		result = num1 + num2;
          		break;
        	
        	case '-':
        		result = num1 - num2;
        		break;
  
        	case '*':
        		result = num1 * num2;
          		break;
  
        	case '/':
        		result = num1 / num2;
        		break;
  
        	default:
        		System.out.println("Enter wrong input");
          		break;
        }
        System.out.println("Final Result:"+result);
        sc.close();
    }
}
