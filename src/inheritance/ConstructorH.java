package inheritance;

public class ConstructorH {

	public static void main(String[] args) {
		Harry h = new Harry(1);
	}
}

class Movie {
	public Movie() {
		System.out.println("Movie()");
	}
	public Movie(int a) {
		this();
		System.out.println("Movie(int a)");
	}

}

class Harry extends Movie {
	public Harry() {
		super(10);
		System.out.println("Harry()");
	}

	public Harry(int a) {
		this();
		System.out.println("Harry(int a)");
	}
}
