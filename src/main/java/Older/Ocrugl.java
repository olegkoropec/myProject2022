package Older;
import java.util.Scanner;
public class Ocrugl {
	public static void main(String[]args){
		Scanner wer = new Scanner (System.in);
		System.out.print("Enter number: ");
		double q;
		q=wer.nextDouble();
		int a= (int)q;
		double b= q%a;		
		if(b>0.5)
		{
		System.out.print(a+1);}
		else{
			System.out.print(a);	
		}
	}
}
