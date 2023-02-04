package dateapidemo;

import java.util.Calendar;
import java.util.Date;

public class CalDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));

//		c.add(Calendar.DATE, 10);
//		Date d1  = new Date(c.getTimeInMillis());
//		System.out.println(d1);

//		c.add(Calendar.DATE, 85);
//		Date d1 = new Date(c.getTimeInMillis());
//		System.out.println(d1);


		c.roll(Calendar.DATE, 29);
		Date d1 = new Date(c.getTimeInMillis());
		System.out.println(d1);

	}

}
















