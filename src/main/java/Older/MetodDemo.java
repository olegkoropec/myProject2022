package Older;

class Metod {
	public int vozv (int a, int b){
		int x, y, z;
		y = a;
		x = b-a+1;
		z = (int) (Math.random()*x+y);
		return z;	
	}

	}
	class MetodDemo{
		public static void main(String args[]){
			int i;
			Metod z1 = new Metod();
			for(i=0; i<10; i++){
				int rez = z1.vozv(5,50);
				System.out.print(" "+ rez);				
			}
		}
		
}
