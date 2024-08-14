package Older;

import java.util.Scanner;
public class Interv {
	public static void main (String[] args){
	Scanner inter = new Scanner (System.in);
	System.out.println("Enter number in an interval [5;155]: ");
	double a = inter.nextDouble();
	if (a<5 || a>155)
	System.out.println("The number is wrong. Run program again ");
	else if (a>=5 && a<=25 || a<=155 && a>=100){
		System.out.printf("����� %.2f �� ���������� � ��������� (25,100)", a);
	}	else if (a>25 && a<100){
		System.out.printf("����� %.2f ���������� � ��������� (25,100)", a);
	}			 
	}
}
