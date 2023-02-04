package dateapidemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
		// 1 convert your date in diff format ==> fixed format
		// 2 convert your String date into Date
		// DateFormat is an abstract class

		Date d = new Date();
		DateFormat df1 = DateFormat.getDateInstance(); // default

		System.out.println(d);
		System.out.println(df1.format(d));// format return string

		df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("short = > " + d);
		System.out.println(df1.format(d));

		df1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Medium = > " + d);
		System.out.println(df1.format(d));

		df1 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Long = > " + d);
		System.out.println(df1.format(d));

		df1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Full = > " + d);
		System.out.println(df1.format(d));

//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter date: (4 Feb, 2023)");
//		String strDate = scr.nextLine();//4 Feb, 2023
//		df1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
//		
//		Date d2 = df1.parse(strDate);
//		System.out.println(d2);
//		

		System.out.println("*****************************************************");

		Date d3 = new Date();
		Locale india = new Locale("hi", "in");
		Locale fr = new Locale("fr");
		Locale ja = new Locale("ja");

		df1 = DateFormat.getDateInstance(DateFormat.FULL, india);
		System.out.println(df1.format(d3));

		df1 = DateFormat.getDateInstance(DateFormat.FULL, fr);
		System.out.println(df1.format(d3));

		df1 = DateFormat.getDateInstance(DateFormat.FULL, ja);
		System.out.println(df1.format(d3));

	}
}
