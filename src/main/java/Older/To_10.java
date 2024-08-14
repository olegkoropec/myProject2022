package Older;

import java.util.Scanner;
public class To_10 {
 public static void main (String args[]){
	 double a = 0, b = 0;
	 System.out.println("Enter two numbers: ");
	 Scanner sca = new Scanner (System.in);
	 	if (sca.hasNextDouble()){
	 		a = sca.nextDouble();
	 		b = sca.nextDouble();
	 	}	 	
	 	if (Math.abs(a-10)>Math.abs(b-10))	
	 		System.out.printf("%.2f ����� � 10 ��� %.2f ",b,a);
	 	else 
	 		System.out.println(a+" ����� � 10 ��� "+b);
	 
 }
}
