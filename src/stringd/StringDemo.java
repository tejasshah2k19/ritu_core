package stringd;

public class StringDemo {

	public static void main(String[] args) {
		String str = "royal";
		String str2 = new String();
		String str3 = new String("royal");
		String str4 = new String(str);
		String str5 = str; 
		String str6 = str4; 

		String str7 = "royal";
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str==str4);
		
		System.out.println(str == str5);
		System.out.println(str6 == str4);
		System.out.println(str == str7);
		
		str5 = "";
	
		String str9 = "Royal";
		System.out.println(str.equals(str9));
		System.out.println(str.equalsIgnoreCase(str9));
		
		System.out.println(str.compareTo(str9));
		System.out.println(str.compareToIgnoreCase(str9));
		
		
	}
}
