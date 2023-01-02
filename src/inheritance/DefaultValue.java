package inheritance;

public class DefaultValue {
	byte b;
	short s;
	char c;
	int i;
	long l;
	float f;
	double d;
	boolean bb;

	public DefaultValue() {
		c = 'x';
	}

	public DefaultValue(int i) {
		this.i = i;
	}

	void display() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);

	}

	public static void main(String[] args) {
		DefaultValue d = new DefaultValue();
		d.display();
		DefaultValue d1 = new DefaultValue(12);
		d1.display();
	}

}

//constructor -> is a special method which has a same name as a class name 
// it must not have any return type 
// it should be public
// it is used to initialize instance variable 

//1) implicit  - default 
//2) explicit  - default + parameterized 
