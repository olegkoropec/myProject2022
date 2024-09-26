package Older;

import java.util.Scanner;
public class Dvuxzn {
	public static void main (String args[]){
		Scanner ent = new Scanner (System.in);
		int a = 0;
		System.out.println("������� ����������� �����: " );
		if (ent.hasNextInt()){
			a = ent.nextInt();					
		}
		int b = (int) a/10;		
		int c = a%(b*10);			
		int d = b+c;	
		System.out.println("������: "+c);
		System.out.println("��������: "+b);
		System.out.println("����� ����� ����� "+ a + " �����: " +d);	
		
	}

}
