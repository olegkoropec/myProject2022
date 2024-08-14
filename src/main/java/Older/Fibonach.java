package Older;

public class Fibonach {
public static void main (String args []){
	int a = 0;
	int b = 1;
	int c = 0;
	for (int i = 1; i<21; i++){
		c = a;
		a = a+b;
		b = c;
		i++;
		System.out.println(a);
		
	}
}
}
