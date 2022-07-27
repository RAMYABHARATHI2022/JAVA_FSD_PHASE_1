package phase1.modifier.p2;

public class Class_X {
	
	private int r=23;
	long s=3000;
	protected float t=12.5f;
	public char u='A';
	
	public void methodPublic()
	{
		System.out.println("We are in Public method");
	}
	protected void methodProtected()
	{
		System.out.println("We are in Protected method");
		
	}
	void methodDefault()
	{
		System.out.println("We are in Default method");
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
	}
}
