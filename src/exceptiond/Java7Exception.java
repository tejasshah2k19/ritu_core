package exceptiond;

import java.util.Scanner;

public class Java7Exception {

	public static void main(String[] args) {
		// db
		// api
		// resource -> file , scanner

		// close
		// Scanner scr = new Scanner(System.in);

		// scr.next();

		// scr.close();//1) 2)

		// j7 -> try with auto resource collection - close
		//AutoCloseable -- interface 
		try (Scanner scr = new Scanner(System.in);) {

		}catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			
		}
	
	
		//implements Closeable 
		//Closeable extends AutoCloseable 
		
	}
}
