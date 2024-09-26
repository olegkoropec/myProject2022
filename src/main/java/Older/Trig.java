package Older;
import java.util.Scanner;
public class Trig {
	public static void main(String []args){
		Scanner ert = new Scanner (System.in);
		System.out.print("Enter degrees: ");
		int s = ert.nextInt();
		double q= Math.cos( Math.toRadians(s));
		double z= Math.sin( Math.toRadians(s));
		System.out.println("cos "+s+ " �������� = " +q);
		System.out.println("sin "+s+ " �������� = " +z);
		System.out.printf("cos %5d �������� = %.2f", s,q);
	}
}
