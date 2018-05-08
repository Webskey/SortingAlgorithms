package org.webskey.algorithms;

import java.util.Arrays;

class QuickSort {

	public static void sort(int[] tab, int low, int high) {
		int piv = tab[high];
		int j = low-1;		
		for(int i = low; i <= high; i++) {
			if(tab[i] <= piv) {
				j++;
				int temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;
			}
		}
		if(j-1 > low)
			sort(tab, low, j-1);
		if(j+1 < high)
			sort(tab, j+1, high);
	}

	public static void main(String[] args) {
		int[] tab = {6, 2, 10, 7, 1, 7, 5, 4};
		System.out.println("Array before sorting: " + Arrays.toString(tab));
		sort(tab, 0, tab.length-1);
		System.out.println("Array after sorting: " + Arrays.toString(tab));
	}
}