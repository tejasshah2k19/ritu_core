package inheritance;

public class ThisSuperMethod {

	public static void main(String[] args) {
		LaserPrinter l = new LaserPrinter();
		l.load();
		l.accessParentLoad();
	}
}

class Printer {
	void load() {
		System.out.println("Printer::load()");
	}
}

class LaserPrinter extends Printer {
	void load() {
		System.out.println("Laser::load()");
	}

	void accessParentLoad() {
		this.load();
		super.load();
	}
}
