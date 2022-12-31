import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {

		int a[];
		a = new int[3];

		int b[] = new int[5];

		int x[][];
		int y[][] = new int[3][2];// 3 row 2 column

		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter number");
			a[i] = scr.nextInt();
		}

		System.out.println("Content of the Array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
