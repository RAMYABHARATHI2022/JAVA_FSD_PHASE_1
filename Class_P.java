package phase1.modifier.p1;

public class Class_P {

	public static void main(String[] args) {
		
		new Class_M().methodPublic();
		new Class_M().methodProtected();
		new Class_M().methodDefault();
		new Class_N().methodPublic();
		new Class_N().methodProtected();
		System.out.println("Value of int"+new Class_M().b);
		
	}
	public void methodPublic()
	{
		System.out.println("We are in M class Public method");
	}
	protected void methodProtected()
	{
		System.out.println("We are in M class Protected method");
		
	}
	void methodDefault()
	{
		System.out.println("We are in M class Default method");
	
	}
}
