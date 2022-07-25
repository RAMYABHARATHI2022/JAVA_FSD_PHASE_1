package phase1.modifier.p2;

import phase1.modifier.p1.M;

public class Z extends M {

	public static void main(String[] args) {
		new M().methodPublic();
		new Z().methodProtected();
		new Z().methodPublic();

	}

}
