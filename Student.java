package sample;

public class Student 
{
	String name;
	int age;
	char section;
	char gender;
	int subject_1=0, subject_2, subject_3;
	float percentage;
	int total;
	
	Student(int subject_1, int subject_2, int subject_3, String n,int x, char y, char z)
	{
		this.name=n;
		this.age=x;
		this.section=y;
		this.gender=z;
		total=subject_1+subject_2+subject_3;
		percentage=total/3;
	}
	
	Student(int subject_2, int subject_3, String n,int x, char y, char z)
	{
		this.name=n;
		this.age=x;
		this.section=y;
		this.gender=z;
		total=subject_1+subject_2+subject_3;
		percentage=total/3;
	}
	public int display()
	{
		System.out.println("NAME: "+name +"  "+ "AGE: "+age +"  "+"SECTION: "+section +"  "+ "GENDER: "+gender);
		System.out.println("Total Marks:"+total);
		System.out.println("Percentage:"+percentage);
		return 0;
	}

	public static void main(String[] args) {
		Student s1=new Student(95,98,99,"Pavi",25,'A','F');
		Student s2=new Student(80,85,90,"Kanaka",20,'B','F');
		Student s3=new Student(70,80,75,"Rahul",22,'c','M');
		Student s4=new Student(80,85,90,"Aakash",21,'B','M');
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
	}

}
