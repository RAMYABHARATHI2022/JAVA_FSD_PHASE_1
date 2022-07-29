package assistedpracticeproject;

abstract class MNC
{
	MNC()
	{
		System.out.println("MNC Company");
	}
	abstract void call();
	
}
abstract class Infosys extends MNC
{
	Infosys()
	{
		System.out.println("Infosys Company");
	}
	abstract void call();
	abstract void holidays();
}
class Hello extends Infosys
{
	void call()
	{
		System.out.println("This method is calling for offer");
	}
	void holidays()
	{
		System.out.println("Apply for optional Holidays");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Infosys i=new Hello();
		i.call();
		i.holidays();
	}
}
