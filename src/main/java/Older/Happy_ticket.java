package Older;

public class Happy_ticket {
public static void main(String args[]){	
	int a = 0;
		
    for (int i = 1; i < 1000000; i++) {
    if (i / 100000 + (i / 10000) % 10 + (i / 1000) % 10 == (i / 100) % 10 + (i / 10) % 10 + i % 10) 
                
           a++;            
        }
        System.out.println("���������� ���������� �������  " + a);	
    }
}
		
