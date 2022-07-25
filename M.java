package phase1.modifier.p1;

public class M {
	
	private int a=20;
	
	long b=1000;
	
	protected float c=24.65f;
	
	public void methodPublic()
	{
		System.out.println("We are in M class Public method");
		methodPrivate();
	}
	protected void methodProtected()
	{
		System.out.println("We are in M class Protected method");
		methodPrivate();
	}
	void methodDefault()
	{
		System.out.println("We are in M class Default method");
		methodPrivate();
	}
	private void methodPrivate()
	{
		System.out.println("Class M");
		System.out.println("Value of private:"+a);
		System.out.println("Value of long:"+b);
		System.out.println("Value of float:"+c);
	}

}
