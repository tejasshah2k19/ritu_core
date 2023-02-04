package dateapidemo;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		float f = 123456.123456f;
		System.out.println(f);
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		
		System.out.println(nf1.format(f));
		nf1.setMaximumFractionDigits(2);
		System.out.println(nf1.format(f));
		
		System.out.println(nf2.format(f));
		
		Locale in = new Locale("in");
		Locale usa = new Locale("us");
		Locale fr = new Locale("fr");
		nf2 = NumberFormat.getCurrencyInstance(in);
		System.out.println(nf2.format(f));
		
		nf2 = NumberFormat.getCurrencyInstance(usa);
		System.out.println(nf2.format(f));
		
		nf2 = NumberFormat.getCurrencyInstance(fr);
		System.out.println(nf2.format(f));
		
		
		
	}
}
