package org.webskey.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(int[] tab) {
		for(int i = 0; i < tab.length; i++) {
			int min = tab[i];
			for(int j = i; j < tab.length; j++) {				
				if( tab[j] < min) {
					int temp = min;
					min = tab[j];
					tab[j] = temp;
				}
			}
			tab[i] = min;
		}
	}
	
	public static void main(String[] args) {
		int[] tab = {5, 23, 3, 5, 10, 6, 8, 4};
		sort(tab);
		System.out.println(Arrays.toString(tab));
	}

}
