package org.webskey.algorithms;

import java.util.Arrays;

public class MergeSort {
	public static void divide(int[] tab, int low, int high) {
		int mid = (high + low)/2;
		if(low < high) {
			
			System.out.println("mid " +mid+ " llow  " +low + " high " +high);
			divide(tab, low, mid);
			divide(tab, mid+1, high);
		
			sort(tab, low, mid, high);
		}
	}
	public static void sort(int[] tab, int low, int mid, int right) {
		int leftL = mid - low + 1;
        int rightL = right - mid;
        
		int tabLeft[] = new int [leftL];
        int tabRight[] = new int [rightL];
 
        for (int i = 0; i < leftL; ++i)
            tabLeft[i] = tab[low + i];
        for (int j = 0; j < rightL; ++j)
            tabRight[j] = tab[mid + 1 + j];
  
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = low;
        while (i < leftL && j < rightL)
        {
            if (tabLeft[i] <= tabRight[j])
            {
                tab[k] = tabLeft[i];
                i++;
            }
            else
            {
                tab[k] = tabRight[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < leftL)
        {
            tab[k] = tabLeft[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < rightL)
        {
            tab[k] = tabRight[j];
            j++;
            k++;
        }
    }
	public static void main(String[] args) {
		int[] tab = {1, 6, 4, 2, 5, 3, 8};
		System.out.println(Arrays.toString(tab));
		divide(tab, 0, tab.length-1);
		System.out.println(Arrays.toString(tab));
	}
}
