package Older;

import java.util.Scanner;
public class Pl {
	public static void main (String [] args){
		double a,b,c;
		double P,S;
		Scanner ert = new Scanner (System.in);
		System.out.println("Enter length of cathetus 1: ");
		 a = ert.nextDouble();
		System.out.println("Enter length of cathetus 2: ");
		 b = ert.nextDouble();
		 c = Math.sqrt(a*a+b*b);
		P = a+b+c;
		S = 0.5*a*b;
		System.out.printf("c = %.2f sm%n", c);// %f - ��� ���� � ��������� ������, %n - ������� �� ������ ������
		System.out.printf("P = %.2f sm%n", P);
		System.out.printf("S = %.2f sm2", S);
		
	}
}
