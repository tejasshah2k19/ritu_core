package exceptiond;

import java.io.File;
import java.io.IOException;

public class CheckedUncheckedException {

	public static void main(String[] args) throws IOException {

		int a = 10;
		int b = 20;
		int c = a / b; // Arithmetic

//		try {
//			File f = new File("test.txt");
//			f.createNewFile(); // IO
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		File f = new File("test.txt");
		f.createNewFile(); // IO

		
		String email = "ram@ymail.com";
		
		// 
		if(!email.contains("@gmail.com")) {
			//throw the exception 
//			InvalidEmailException i = new InvalidEmailException();
//			throw i;
			throw new InvalidEmailException();
		}
	}
}

//checked  --> compulsory handle 
//unchecked --> optional 

//Exception -->   IOException , 

//unchecked 
//Exception --> RuntimeException --> Arithmetic Null Array Input 

//custom exception 

//1) Exception 
//2) error msg -> parent using constructor 

class InvalidEmailException extends RuntimeException {

	public InvalidEmailException() {
		super("Invalid Email Format");
	}
}



