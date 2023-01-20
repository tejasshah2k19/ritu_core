package stringd;

public class StringMethods {

	public static void main(String[] args) {
		String str = "royal";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str);// rosyal

		str = str.toUpperCase();
		System.out.println(str);
		str.toLowerCase();
		System.out.println(str);

		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('r'));// -1
		System.out.println(str.indexOf('z'));// -1
		System.out.println(str.indexOf('R'));// -1

		System.out.println(str.concat("education"));

		System.out.println(str.replace('R', 'r'));
		System.out.println(str.replace("RO", "rx"));

		String s = "jony jony yes papa";
		String sa[] = s.split(" ");

		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}

		for (String x : sa) {
			System.out.println(x);
		}

		//next() - tejas [can not scan space ] 
		//nextLine() -- tejas shah 
	}
}
