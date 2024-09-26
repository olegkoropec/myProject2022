package Older;
import java.util.Scanner;
public class Mod {
	public static void main(String[] args){
		Scanner wer = new Scanner (System.in);
		int q = 0;
		int a = 0;

		System.out.println("Enter number 1:");
		if (wer.hasNextInt()){
		q = wer.nextInt();
		}
		else {
			System.out.println("�� ����� �� �����");
			}
		System.out.println("Enter number 2:");
		if (wer.hasNextInt()){
		a = wer.nextInt();
		}
		else {
			System.out.println("�� ����� �� �����");
			}	
		System.out.println(q/a+ " � "+q%a+" � �������");
	}
}
 