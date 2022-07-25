package phase1.modifier.p1;

public class P {

	public static void main(String[] args) {
		
		new M().methodPublic();
		new M().methodProtected();
		new M().methodDefault();
		new N().methodPublic();
		new N().methodProtected();
		System.out.println("Value of int"+new M().b);
		
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
	private void methodPrivate()
	{
		System.out.println("We are in M class Private method");
	}

}
