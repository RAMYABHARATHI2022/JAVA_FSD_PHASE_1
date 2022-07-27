package phase1.modifier.p2;

import phase1.modifier.p1.N;

public class Class_Y extends Class_N {

	public static void main(String[] args) {
		new Class_N().methodPublic();
		new Class_Y().methodProtected();
		new Class_Y().methodPublic();
	}
}
