package sample;

class Shape
{
	float area()
	{
		return 0;
	}
}
class RECTANGLE extends Shape
{
	float area()
	{
		int r2=5*6;
		return (r2);
	}
}
class TRIANGLE extends Shape
{
	float area()
	{
		double t1=((0.5)*4*3);
		float t2=(float)t1;
		return(t2);
	}
}
class SQUARE extends Shape
{
	float area()
	{
		int s1=6*6;
		return(s1);
	}
}
class RHOMBUS extends Shape
{
	float area()
	{
		int r1=2*2;
		return(r1);
	}
}
public class DynamicPolymorphism {

	public static void main(String[] args) 
	{
		Shape s;
		s=new RECTANGLE();
		System.out.println("Area of Rectangle: "+s.area());
		s=new TRIANGLE();
		System.out.println("Area of Triangle: "+s.area());
		s=new SQUARE();
		System.out.println("Area of Square: "+s.area());
		s=new RHOMBUS();
		System.out.println("Area of Rhombus: "+s.area());
	}
}
