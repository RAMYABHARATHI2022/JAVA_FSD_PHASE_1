package sample;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Started Java");
		
		sb.append("Java");     //Now original string is changed
		System.out.println(sb);     //print Hello Java
		
		sb.insert(2,"PYTHON");
		System.out.println(sb);
		
		sb.replace(1,3,"NODEJS");
		System.out.println(sb);
		
		sb.delete(1,3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.charAt(3);
		System.out.println(sb);

	}

}
