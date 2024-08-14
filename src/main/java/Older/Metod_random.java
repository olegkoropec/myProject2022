package Older;

import java.util.Scanner;
public class Metod_random {
	public static void rand (int a, int b){
		int c = (int)(Math.random()*((b-a)+1)+a);
		System.out.printf("��������� ����� �� ��������� [%d;%d]=%d ",a,b,c);	
		
	}
	public static void rand_arr (int a ,int b){
		int[] arr = new int [10];
		int i;
			for (i=0; i<arr.length ; i++)
			{
			arr[i] = (int)(Math.random()*((b-a)+1)+a);
			System.out.print(arr[i]+" ");
			}
	}
	public static void main(String args[]){
		int a =0 ,b = 0;
		Scanner scn = new Scanner(System.in);
		System.out.printf ("Enter 2 numbers %n");
		a = scn.nextInt();
		b = scn.nextInt();		
		rand(a,b);
		rand_arr(a,b);
		
	}
	
}
