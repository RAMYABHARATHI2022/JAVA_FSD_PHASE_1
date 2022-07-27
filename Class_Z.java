package phase1.modifier.p2;

import phase1.modifier.p1.M;

public class Class_Z extends Class_M {

	public static void main(String[] args) {
		new Class_M().methodPublic();
		new Class_Z().methodProtected();
		new Class_Z().methodPublic();

	}

}
