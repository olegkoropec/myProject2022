package Older;

class ArrQuick {
	int[] arrQ;
	int nElems;

	ArrQuick(int elems) {
		arrQ = new int[elems];
		nElems = 0;
	}

	void insert(int i) {
		arrQ[nElems] = i;
		nElems++;
	}

	void enter() {
		for (int j = 0; j < nElems; j++)
			System.out.print(arrQ[j] + " ");
		System.out.println();
	}

	void sort(int arr[]) { // , int first, int end
		System.out.print(" Hello");

	}
}

public class SortQuick {
	public static void main(String[] args) {
		int amount = 15;
		ArrQuick arr = new ArrQuick(amount);
		for (int el = 0; el < amount; el++) {
			int number = (int) (Math.random() * 20);
			arr.insert(number);
		}
		arr.enter();
		arr.sort(null);
	}
}
