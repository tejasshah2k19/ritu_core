package dateapidemo;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		//java.sql 
		//java.util 
		Date d =new Date(); 

		System.out.println(d);
	
		//0 
		System.out.println(d.getMonth());//deprecated 
		System.out.println(d.getDate());
		System.out.println(d.getHours());
	
	
	
		Date d1 = new Date(0);
		System.out.println(d1); 
	
		d1 = new Date(1000*60*60);
		System.out.println(d1); 
	
		System.out.println(d.getTime());
		
	} 
	
	
}
