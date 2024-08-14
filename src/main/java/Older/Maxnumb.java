package Older;

public class Maxnumb {
public static void main (String args[]){
	int d = (int) (Math.random()*900+100);
	System.out.println (d);
	int a = (int) d/100;
	int b = (int)(d-a*100)/10;
	int c = d-a*100-b*10;
		/*System.out.println ("a = "+a);
		System.out.println ("b = "+b);
		System.out.println ("c = "+c);*/
	if (a>=b && a>=c)											//; ������� �� �����
	System.out.println ("���������� �����: "+a);
	else if (b>=a && b>=c){										//; ������� �� �����
	System.out.println ("���������� �����: "+b);
	}else if (c>=a && c>=b){									//; ������� �� �����
		System.out.println ("���������� �����: "+c);}
	
	}
}
