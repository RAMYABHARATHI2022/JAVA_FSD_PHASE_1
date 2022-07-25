package phase1.modifier.p1;

public class N {
	
	protected long d=2563;
	
	public int e=10;
	
	double f=23.6542;
	
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
		System.out.println("Value of long:"+d);
		System.out.println("Value of int:"+e);
		System.out.println("Value of double:"+f);
	}

}
