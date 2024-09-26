package Older;

import java.util.Scanner;
public class Mathem {
	public static void main (String args[]){
		System.out.println(Math.PI);
		System.out.println(Math.round(Math.PI));
		System.out.println(Math.ceil(Math.PI));
		System.out.println(Math.abs (-45));
		int a=8, b=0;
		int c = 5;	
		int e = 0; 	
		double d90 = Math.toRadians(90);
		double d60 = Math.toRadians(60);
		double d45 = Math.toRadians(45);
		System.out.println(d90);
		System.out.printf("� 90 �������� %.3f ������ %n  ",d90);
		System.out.printf("� 1 ������� %.3f �������� %n" ,Math.toDegrees(1));
		System.out.println("cos ���� 90 ��������: "+(int)Math.cos(d90));
		System.out.printf("cos ���� 60 ��������: %.1f %n",Math.cos(d60));
		System.out.println("cos ���� 45 ��������: "+Math.cos(d45));
		System.out.println("Enter two numbers: ");
		Scanner num  = new Scanner(System.in);		
		if (num.hasNextInt())	{
			a = num.nextInt();
			b = num.nextInt();
			}	
		e = (int) Math.pow(a,b) ;
		System.out.printf("%d � ������� %d = %d", a,b,e);			
	}
}
