
//static import 
import static java.lang.Math.*;

public class VariableType {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		// name -> 3 copy => per instance -> individual copy
		s1.name = "ritu";
		s2.name = "ram";
		s3.name = "java";
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);
		System.out.println(s1.schoolCode);
		System.out.println(Student.schoolCode);

		// static
		System.out.println(Math.random());
		System.out.println(Math.sqrt(9));
		System.out.println(Math.floor(20.20));

		// direct
		System.out.println(random());
		System.out.println(sqrt(9));
		System.out.println(floor(20.20));

	}
}

class Student {
	String name;// instance variable
	static int schoolCode = 12;// static variable - class variable
	// static -> one and only one copy in memory

	// using object u can access
	void print() {
		int age;// local -> block -> stack
		for (int i = 1; i <= 5; i++)
			;
		System.out.println(name);
	}

	// can be access via class name or object name
	static void add() {
//		System.out.println(name); //you can access only static property in static method 

	}
}

//three types of variable 
//class -> 