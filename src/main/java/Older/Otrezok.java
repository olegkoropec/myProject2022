package Older;

import java.util.Scanner;
public class Otrezok {
	public static void main (String[]args){
		Scanner rt = new Scanner (System.in);
		System.out.println("Enter number: ");
		int a = rt.nextInt();
		int s = (int) (Math.random()*(2*a+1)-a);
		System.out.printf("��������� ����� �� ��������� [-%d; %d] = " , a,a);
		System.out.print(s);
		
	}
}
