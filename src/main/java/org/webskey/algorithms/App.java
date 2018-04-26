package org.webskey.algorithms;

import java.util.Arrays;

public class App {
	public static void main( String[] args ) {
		int[] tab = {5, 3, 2, 6, 1, 7, 5};
		int piv = tab[tab.length-1];
		System.out.println(piv);
		int j = -1;
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] <= piv) {
				j++;
				int temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;

			}
		}
		System.out.println(Arrays.toString(tab));
		//-------------//--------------//
		piv = tab[tab.length-1];
		System.out.println(piv);
		j = j-1;
		for(int i = j; i < tab.length; i++) {
			if(tab[i] <= piv) {
				int temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(tab));        
		//-------------//--------------//
		piv = tab[3];
		System.out.println(piv);
		j = 0;
		for(int i = j; i < tab.length; i++) {
			if(tab[i] <= piv) {
				int temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(tab));
		System.out.println(j);
		//-------------//--------------//
		piv = tab[2];
		System.out.println(piv);
		j = 0;
		for(int i = j; i < tab.length; i++) {
			if(tab[i] <= piv) {
				int temp = tab[i];
				tab[i] = tab[j];
				tab[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(tab));
		System.out.println(j);
	}
}
