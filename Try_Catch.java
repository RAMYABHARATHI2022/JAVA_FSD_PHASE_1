package assistedpracticeproject;

public class Try_Catch {

	public static void main(String[] args) {
		int num1,num2,num3;
		num1=20;
		num2=0;
		
		try
		{
			num3=num1/num2;
			System.out.println("Result is "+num3);
		}
		/*catch(NullPointerException ae1)   //child
		{
			System.out.println("Numbers cannot be divided by zero");
			System.out.println(ae.getMessage());
		}
		*/
		catch(Exception ae)    //parent
		{
			System.out.println("I'm before the subclass exception");
			System.out.println(ae.getMessage());
		}
		finally
		{
			num3=num1/num2;
			System.out.println("In this block always executed");
			System.out.println("Result: "+num3);
		}
	}
}
