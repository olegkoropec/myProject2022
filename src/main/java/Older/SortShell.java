package Older;

class ArrSh {
	static private int[] arr;
	private static  int nElems;
ArrSh(int maxSize){
	arr = new int [maxSize];
	nElems = 0;	
}
void insert (int x){
	arr[nElems] = x;
	nElems++;
}
 static void display(){
	for(int i=0; i<nElems; i++)
		System.out.print(arr[i]+" " );
	System.out.println();
}
 void sort(){
	int step = arr.length/2;
	while (step>0){
		for (int i = step; i<arr.length; i++){
			for (int j = i; j >= step && arr[j] < arr[j-step]; j = j-step){
				int temp = arr[j];
				arr[j] = arr[j-step];
				arr[j-step] = temp;
			}
			/*	for(int q=0; q<nElems; q++)
				System.out.print(arr[q]+" " );
			System.out.println();	*/	
		}
	step = step/2;	
	}
}
}
public class SortShell {
	public static void main(String args[]){
		int maxSizes = 10;
		ArrSh arr = new ArrSh(maxSizes);
		for (int i=0; i<maxSizes; i++){
			int ins = (int) (Math.random()*100);
			arr.insert(ins);
		}
		
		display();
		arr.sort();
		arr.display();
		
	}

	private static void display() {
		// TODO Auto-generated method stub
		
	}

}
