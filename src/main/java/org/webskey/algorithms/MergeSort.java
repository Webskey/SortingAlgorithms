package org.webskey.algorithms;

import java.util.Arrays;

public class MergeSort {
	
	public static void divide(int[] tab, int low, int high) {
		int mid = (high + low)/2;
		if(low < high) {
			divide(tab, low, mid);
			divide(tab, mid+1, high);
		
			merge(tab, low, mid, high);
		}
	}
	
	public static void merge(int[] tab, int low, int mid, int high) {
		int leftL  = mid - low + 1;
		int rightL = high - mid;
		int[] left = new int[leftL];
		int[] right = new int[rightL];
		
		for(int i = 0; i < leftL; i ++) {
			left[i] = tab[low + i];
		}
		
		for(int j = 0; j < rightL; j++) {
			right[j] = tab[mid + 1 + j];
		}
		
		int lf = 0 , rf = 0;
		int tf = low;
		while(lf < leftL && rf < rightL)
		if(left[lf] > right[rf]) {
			tab[tf] = right[rf];
			tf++;
			rf++;
		}
		else {
			tab[tf] = left[lf];
			tf++;
			lf++;
		}
		
		while(lf < leftL) {
			tab[tf] = left[lf];
			tf++;
			lf++;
		}
		
		while(rf < rightL) {
			tab[tf] = right[rf];
			tf++;
			rf++;
		}
	}
	
	public static void main(String[] args) {
		int[] tab = {1, 6, 4, 2, 5, 3, 8};
		System.out.println(Arrays.toString(tab));
		divide(tab, 0, tab.length-1);
		System.out.println(Arrays.toString(tab));
	}
}
