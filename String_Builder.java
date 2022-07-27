package sample;

public class String_Builder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Started Java");
		
		sb.append("Phase 1");
		System.out.println(sb);
		
		sb.delete(8, 12);
		System.out.println(sb);
		
		sb.replace(8,13,"Python");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(9));
	}
}
