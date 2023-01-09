package abstractd;

public class AbstractDemo {

	public static void main(String[] args) {
		Mercedez m = new Mercedez();
		m.start();
		m.gear();
	}

}

abstract class Car {
	//
	abstract void start();
	
	void gear() {
		System.out.println("Car::gear()");
	}

	Car() {
		// we can have constructor in abstract class
	}
}

//extends Car -> Mercedez must have to override abstract method or mark Mercedez as an abstract 
class Mercedez extends Car {
	void start() {
		System.out.println("Mercedez::start()");
	}
}