package com.Searcher;

public class Searcher {

	public static int search(int array[], int target) {
		
		int max = array.length-1;
		int min = 0;
		
		while(max >= min) {
			int mid = (max + min)/2;
			
			if(array[mid] == target) {
				return mid + 1 ;
			}
			else if(array[mid] > target){
				max = array[mid - 1];
			}
			else {
				min = array[mid + 1];
			}
		}
		return -1;
	}
}
