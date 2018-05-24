package org.webskey.algorithms;

import java.util.Arrays;

public class HeapSort {
	
	public static void sort(int[] arr, int last) {
		while(last > 0) {
		int start = (last - 2) / 2;
		Heapify.heapify(arr, start, last);
		int tmp = arr[last-1];
		arr[last-1] = arr[0];
		arr[0] = tmp;
		last--;
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 6, 2, 7, 3, 9, 1, 4, 5, 16, 2, 21, 0};	
		sort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
