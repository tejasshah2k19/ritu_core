package dateapidemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {

		Locale locale = new Locale("fr");
		ResourceBundle rb = ResourceBundle.getBundle("Labels", locale);
		System.out.println(rb.getString("hello"));
	}
}
