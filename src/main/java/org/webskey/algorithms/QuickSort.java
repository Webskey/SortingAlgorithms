package org.webskey.algorithms;

import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] tab, int low, int high) {
		int piv = tab[high];
		System.out.println("pivot: " +piv);
		int j = low-1;		
		for(int i = low; i <= high; i++) {
			if(tab[i] <= piv) {
				j++;
				int temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;
			}
		}
		System.out.println(Arrays.toString(tab));
		System.out.println(j);
		for(int i = j; i>1; i--) {			
			sort1(tab, 0, i-1);
		}
	}
	public static void sort1(int[] tab, int low, int high) {
		int piv = tab[high];
		System.out.println("pivot: " +piv);
		int j = low-1;		
		for(int i = low; i <= high; i++) {
			if(tab[i] <= piv) {
				j++;
				int temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;
			}
		}
		System.out.println(Arrays.toString(tab));
	}
	public static void main(String[] args) {
		int[] tab = {5, 2, 3, 6, 1, 7, 5, 8};
		System.out.println(Arrays.toString(tab));
		sort(tab, 0, tab.length-1);

		/*System.out.println("DRUGIE");		
		int[] tab1 = {5, 3, 2, 1, 5, 7, 6};
		sort(tab1, 0, 3);		

		System.out.println("Trzecie");		
		int[] tab2 = {1, 3, 2, 5, 5, 7, 6};
		sort(tab2, 0, 2);

		System.out.println("Czwarte");		
		int[] tab3 = {1, 2, 3, 5, 5, 7, 6};
		sort(tab3, 0, 1);*/
	}
}
