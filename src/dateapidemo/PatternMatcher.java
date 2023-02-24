package dateapidemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {

		// mv75hy6isd74h5iufg87r8t54tng

		// m
		// az
		// AZ
		// digit
		// 7

		// + => 1 N

		// 8
		// [2468]
		// [0-9]
		// [0-9]+

	}

	void pattern1() {
		Pattern p = Pattern.compile("[0-9]+");// regex
		Matcher m = p.matcher("mv75hy6isd74h5iufg87r8t54tng");// data

		while (m.find()) {
			// System.out.println(m.group() + "\t" + m.start());
			System.out.printf("\n%-4s %-4d", m.group(), m.start());
		}
		System.out.println("\n**********");
	}

	//10   : decimal 
	//010  : octal
	//0b10 : binary 
	//0x10 : hexadecimal 
	void pattern2() {
		Pattern p = Pattern.compile("0[xX][0-9a-fA-F]+");// regex
		Matcher m = p.matcher("mv75hy6isd74h5iufg87r8t54tng");// data

		while (m.find()) {
			// System.out.println(m.group() + "\t" + m.start());
			System.out.printf("\n%-4s %-4d", m.group(), m.start());
		}
		System.out.println("\n**********");
	}
//XXX@XXX.XXX
}
