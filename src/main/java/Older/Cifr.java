package Older;

import java.util.Scanner;
public class Cifr {
	public static void main(String[]args){
		Scanner er = new Scanner (System.in);
		int c;
		System.out.println("Enter number: ");
		c = er.nextInt();
		if(c>=0 && c<=9)				
		System.out.printf("Number %d has 1 numeral %n", c); 		
		else {
		if(c>=10 && c<=99)
			System.out.printf("Number %d has 2 numeral %n", c);		
			else {
				if(c>=100 && c<=999)
				System.out.printf("Number %d has 3 numeral %n", c);		
				else {
					if(c>=1000 && c<=9999)
					System.out.printf("Number %d has 4 numeral %n", c);		
						else {
						System.out.println("Run again and enter other number");
						}
				}
			}
		}
		}
}
