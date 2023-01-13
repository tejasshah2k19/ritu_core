
public class LitearlsDemo {

	public static void main(String[] args) {
		int a = 10;// decimal
		int c = 0b10;// binary [bB]
		System.out.println(c);

		int d = 010;// octal
		int e = 0x10A;// hexa [xX]

		System.out.println(d);

		int amt = 10_00_000;
//		int amtInvalid = _10;

		byte bb = 1;
		byte cc = 1;

//		byte dd = bb + cc;//int 
		int dd = bb + cc;
	}
}
