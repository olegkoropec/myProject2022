package Older;

//import java.io.*;
class SortArreyVybor {
	public static void main(String[]args){
	int arr[] = new int [10];
			for (int i=0; i<arr.length; i++){
				arr[i]=(int)(Math.random()*100);
				System.out.print(arr[i]+" ");
				}
			
			System.out.println();			
			for (int i=0; i<arr.length; i++){
				int min=arr[i];
				int imin=i;
				for(int j=1; j<arr.length; j++){
					if(arr[j]<min){
						min=arr[j];
						imin=j;
					}					
					
					}
				System.out.print(arr[i]+" ");
				}
			
			}
	
	}
				        
					
					
				
		
			
			


