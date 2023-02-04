package stringd;

public class StringBufferDemo {

	public static void main(String[] args) {

		// StringBuffer --> synchronized -- Thread Safe  
		// StringBuilder --> non synchronized --
		// -1LAC 
		
		String s1 = "royal";
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer("royal");
		StringBuffer sb2 = new StringBuffer(s1);

//		StringBuffer sb3 = "ss";

		sb1.append("education");
		System.out.println(sb1);

		sb1.delete(2, 5);// 2 3 4
		System.out.println(sb1);
		
		sb1.insert(2, "du");
		System.out.println(sb1);

		String ss="royal";
		StringBuffer sb3 = new StringBuffer(ss);
		sb3.reverse();
		
		String rev = sb3.toString();
		System.out.println(ss);
		System.out.println(rev);

		
		
		sb.append("royal");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	
	
	}
}









