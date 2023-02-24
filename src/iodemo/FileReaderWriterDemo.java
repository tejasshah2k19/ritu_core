package iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("demo.txt");

		FileWriter fw = new FileWriter(f);

		// create
		fw.write("royal");
		fw.write("edu");
		fw.close();

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

//		int b;
//		System.out.println("content\n");
//		while (true) {
//			b = fr.read();
//			if (b == -1) {
//				break;
//			}
//			System.out.print((char) b);
//		}
//		fr.close();

		String str = "";
		while (true) {
			str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();
	}
}
