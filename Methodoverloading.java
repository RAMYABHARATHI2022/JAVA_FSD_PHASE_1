package sample;

public class Methodoverloading {
	public int add(int x, int y) {
		System.out.println("Add two numbers:" + (x + y));
		return 0;
	}

	public int area(char r) {
		System.out.println("Area of circle:" + (3.14 * r * r));
		return 0;
	}

	public int area(int l, float b) {
		System.out.println("Area of rectangle:" + (l * b));
		return 0;
	}

	public int area(int b, int h) {
		System.out.println("Area of triangle:" + (0.5 * b * h));
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading obj = new Methodoverloading();
		obj.add(2, 3);
		obj.area('a');
		obj.area(6, 5);
		obj.area(4, 2.5f);

	}

}
