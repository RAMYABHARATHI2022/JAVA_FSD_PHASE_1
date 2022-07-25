package sample;

public class Typecast {

	public static void main(String[] args) {

		System.out.println("Implicit Type Casting");
		char a = 'F';
		System.out.println("Value of a: " + a);

		int b = a;
		System.out.println("Value of b: " + b);

		float c = a;
		System.out.println("Value of c: " + c);

		long d = a;
		System.out.println("Value of d: " + d);

		double e = a;
		System.out.println("Value of e: " + e);

		System.out.println("Explicit Type Casting");

		double d1 = 4684315.256412326;
		long l2 = (long) d;
		float r = (float) d;
		System.out.println("Float values:" + r);
		System.out.println("Double values:" + d);
		System.out.println("Long values:" + l2);

	}

}
