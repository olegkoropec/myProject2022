package Older;

import java.util.Scanner;

public class Zz_Proba {

	public static void main(String[] args) {

		Scanner scanI = new Scanner(System.in);
		Scanner scanS = new Scanner(System.in);
		Scanner scanD = new Scanner(System.in);
		System.out.println("Enter the int:");
		int i = 0;
		String str = null;
		double d = 0;
		while (!scanI.hasNextInt()) {
			if (scanI.hasNextInt())
				i = scanI.nextInt();
			else
				System.out.println("You enter no integer");
		}
		System.out.println("Enter the string:");

		while (!scanS.hasNextLine()) {
			if (scanS.hasNextLine())
				str = scanS.nextLine();
			else
				System.out.println("You enter no String");
		}
		System.out.println("Enter the double:");

		while (!scanD.hasNextDouble()) {
			if (scanD.hasNextDouble())
				d = scanD.nextDouble();
			else
				System.out.println("You enter no double");
		}

		System.out.println("String: " + str);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

	}

}
