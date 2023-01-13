
public class IntializerBlock {
	static {
		System.out.println("Initializer Bloc...static...");
	}

	{
		System.out.println("init..instance...");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		// when class is loading into a memory static block will call
		Mouse m1 = new Mouse();// instance block - constructor
		Mouse m2 = new Mouse();// instance block - constructor
		System.out.println("End");
	}
}

class Mouse {
	int wheel;
	int clickButton;
	static int dpi;

	Mouse() {
		System.out.println("Mouse()");
	}

	// block
	// static
	// instance

	{
		wheel = 1;
		System.out.println("instance{}");
	}
	// you can access only static property
	static {
		dpi = 500;
		System.out.println("static{}");
	}
}
