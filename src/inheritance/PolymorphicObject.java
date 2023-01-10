package inheritance;

public class PolymorphicObject {

	public static void main(String[] args) {
		Car c = new Car();
		Dzire d = new Dzire();
		Amaze a = new Amaze();

		Car cd = new Dzire();// poly
		cd.start();// compile time -> Car :: runtime -> Dzire
		cd.stop();
//		cd.powerCharger();

//		c = a; // car = amaze
//		c.start();
//
//		((Amaze) (c)).start();
//
//		c = d;
//		c.start();
		c = a; 
		
		a = (Amaze)c; 
		
	}
}

class Car {
	void start() {
		System.out.println("car::start");
	}

	void stop() {
		System.out.println("Car::stop()");
	}
}

class Dzire extends Car {
	void start() {
		System.out.println("Dzire::start");
	}

	void powerCharger() {
		System.out.println("Dzire::PowerCharger");
	}
}

class Amaze extends Car {
	void start() {
		System.out.println("Amaze::start");
	}

	void powerAdapter() {
		System.out.println("Amaze::PowerAdapter");
	}
}



abstract class DOT{
	//call()
	
}

class JIO extends DOT{
	
}

class Vodafone extends DOT{
	
}
