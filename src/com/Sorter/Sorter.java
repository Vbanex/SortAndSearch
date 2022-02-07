package com.Sorter;

public class Sorter {

	public static int[] sort(int array[]) {
		
		int number = array.length;
		int i, j, temp;
		
		for(i = 0; i < number-1; i++) {
			
			for(j = 0; j < number -i-1; j++) {
				
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			
		}
		return array;
	}
}
