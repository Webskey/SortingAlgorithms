package org.webskey.algorithms;

import java.util.Arrays;

public class InsertSort {

	public static void insertSort(int[] tab, int low) {
		for(int i = 0; i < low; i++) {
			if(tab[i] > tab[low])
				move(tab, low, i);
		}
	}

	public static void move(int[] tab, int at, int to) {
		int p = tab[at];
		for(int i = at; i > to; i--) {			
			tab[i] = tab[i-1];
		}
		tab[to] = p;
	}

	public static void main(String[] args) {
		int[] tab = {1, 4, 6, 5, 2, 3, 7};

		for(int i = 2; i < tab.length; i++)
			insertSort(tab, i);

		System.out.println(Arrays.toString(tab));
	}	 
}