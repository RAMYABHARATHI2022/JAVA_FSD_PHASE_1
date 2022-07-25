package sample;

public class Callbyvalue {
	int val = 150;

	int operation(int val) {
		val = val * 10 / 100;
		return val;
	}

	public static void main(String[] args) {
		Callbyvalue d = new Callbyvalue();
		System.out.println("Before operation value of data:" + d.val);
		int f = d.operation(100);
		System.out.println("After operation value of data:" + f);
	}

}
