package Older;
import java.util.Scanner;
	public class Sum {
		public static void main(String[]args){
	int q=0;
	
	Scanner wer = new Scanner (System.in);
	System.out.print("Enter number: ");
	q=wer.nextInt();
	int a= q/10;
	int b= q%10;
	int c= a+b;
	System.out.print(c);	
	
}

}
