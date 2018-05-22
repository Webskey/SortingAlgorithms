package org.webskey.algorithms;

import java.util.Arrays;

public class Heapify {
	public static void heapify(int[] arr, int start) {
		for(int i = start; i >= 0 ; i--) {
			int leftKid = i * 2 + 1;
			int rightKid;
			if( !((i * 2 + 2) > (arr.length - 1)))
				rightKid = i * 2 + 2;
			else
				rightKid = 0;
			
			int bigger;
			if ( arr[leftKid] > arr[rightKid])
				bigger = leftKid;
			else 
				bigger = rightKid;
			
			if(arr[bigger] > arr[i]) {
				int tmp = arr[i];
				arr[i] = arr[bigger];
				arr[bigger] = tmp;
				heapify(arr, i);
			}			
		}
	}

	public static void main(String[] args) {
		int[] arr = {4, 5, 7, 3, 1, 14, 8, 6, 2, 9};
		int start = (arr.length - 2) / 2;
		heapify(arr, start);
		System.out.println(Arrays.toString(arr));
	}
}
