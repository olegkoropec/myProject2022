package Older;

import java.util.Scanner;
public class Otrezok1 {
	public static void main (String args[]){
		Scanner qw = new Scanner (System.in);
		System.out.println("Enter 2 numbers: ");
		int a = qw.nextInt();
		int b = qw.nextInt();
		int c = (int) (Math.random()*((b-a)+1)+a);
		System.out.printf("��������� ����� �� ��������� [%d;%d]= ",a,b);
		System.out.print(c);
		
	}
}
