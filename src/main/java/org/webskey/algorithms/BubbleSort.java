package org.webskey.algorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] kolekcja) {
		for (int i = 0; i<kolekcja.length; i++) {
			for (int j = 1; j<kolekcja.length; j++) {
				if (kolekcja[j]<kolekcja[j-1]) {
					int wieksza = kolekcja[j-1];
					kolekcja[j-1] = kolekcja[j];
					kolekcja[j] = wieksza;
				}
			}
		}
		System.out.println(Arrays.toString(kolekcja));
	}
	public static void main(String[] args) {
		int[] tab = {2, 3, 5, 2, 3, 20};
		bubbleSort(tab);		
	}
}
