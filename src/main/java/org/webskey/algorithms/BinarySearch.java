package org.webskey.algorithms;

public class BinarySearch {
	
	public static int search(int[] tab, int find, int low, int high) {
		int mid =((low + high + 1)/ 2);
		if(tab[mid] == find) 
			return mid;
		else if(tab[mid] > find) 
			return search(tab, find, low, mid);
		else
			return search(tab, find, mid, high);		
	}
	
	public static void main(String[] args) {
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15,
				16, 21, 22, 23, 24, 25, 26, 27, 28, 31, 32, 33, 34, 35, 40};
		int find = 33;
		int low = 0;
		int high = tab.length-1;

		System.out.println("Liczba " + find + " znaleziona na pozycji " + search(tab, find, low, high));
	}
}
