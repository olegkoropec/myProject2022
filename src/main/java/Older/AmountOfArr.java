package Older;

public class AmountOfArr {
	int mass[] = new int[15]; 
	int mass1[] = {-1, 3, 4, 5, 9, 17, 24, 48, -16};
	int mass2[] = {1,2,3,4,5,6,7,8,9,10, -1, -2,-3, -4, -5};
	public void arr (){
		for (int k=0; k<mass.length; k++){
			mass[k] = (int)(Math.random()*11)-5;
			System.out.print(mass[k]+" " );
		}
	}
	public void arr1 (){
		for (int l=0; l<mass1.length; l++){			
			System.out.print(mass1[l]+" " );
		}
	}
	public void arr11 (){
		for (int l=0; l<mass1.length; l++){
			for (int j=l+1; j<mass1.length; j++ ){
				if (mass1[l] + mass1[j] == 8)
				System.out.println(mass1[l] + " " + mass1[j] );				
			}			
		}
	}
	public void arr2 (){
		for (int l=0; l<mass2.length; l++){			
			System.out.print(mass2[l]+" " );
		}
	}
	public void arr22 (){
		for (int l=0; l<mass2.length; l++){
			for (int j=l+1; j<mass2.length; j++ ){
				if (mass2[l] + mass2[j] == 5)
				System.out.println(mass2[l] + " " + mass2[j] );				
			}			
		}
	}
	public static void main (String args[]){
		AmountOfArr am = new AmountOfArr();
		System.out.println("This is random arrey: ");
		am.arr();
		System.out.printf("%n");
		System.out.println("This is first arrey. Amount must be equals 8 : ");
		am.arr1();
		System.out.println();
		am.arr11();
		System.out.println("This is second arrey. Amount must be equals 5 : ");		
		am.arr2();
		System.out.println();
		am.arr22();
		
	}
}
