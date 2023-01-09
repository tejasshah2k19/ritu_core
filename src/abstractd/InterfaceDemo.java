package abstractd;

public class InterfaceDemo {

	public static void main(String[] args) {

	}
}

interface RBI {
	// final public static
	float ROI = 5.5f;

	// public abstract
	void wid();

	abstract void dep();

	public abstract void checkBal();
}

abstract interface GOI {

}

interface IRDA extends GOI{
	void wid();
}

abstract class ICICI implements RBI {

}

class HDFC implements RBI, IRDA {
	public void wid() {
		System.out.println(RBI.ROI);
		System.out.println(HDFC.ROI);
	}

	public void dep() {

	}

	public void checkBal() {

	}
}
