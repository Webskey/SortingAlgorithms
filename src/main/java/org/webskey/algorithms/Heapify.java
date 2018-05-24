package org.webskey.algorithms;

import java.util.Arrays;

public class Heapify {
	public static void heapify(int[] arr, int start, int end) {
		for(int i = start; i >= 0 ; i--) {
			int leftKid = i * 2 + 1;
			int rightKid = i * 2 + 2;
						
			int bigger = i;
			if (leftKid < end && arr[leftKid] > arr[i])
				bigger = leftKid;
			if (rightKid < end && arr[rightKid] > arr[i])
				bigger = rightKid;
			
			if(bigger != i) {
				int tmp = arr[i];
				arr[i] = arr[bigger];
				arr[bigger] = tmp;
				heapify(arr, bigger, end);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {4, 5, 7, 3, 1, 14, 8, 6, 12, 9};
		int l = arr.length;
		int start = (l - 2) / 2;
		heapify(arr, start, l);
		System.out.println(Arrays.toString(arr));
	}
}
