package phase1.modifier.p2;

import phase1.modifier.p1.N;

public class Y extends N {

	public static void main(String[] args) {
		new N().methodPublic();
		new Y().methodProtected();
		new Y().methodPublic();

	}

}
