package com.RJweek1;

class SelectionSort extends SortingAlgorithm {

	@Override
	void sort(int[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			int max = i;
			for(int j=i+1;j<n;j++) {
				
				if(arr[max]>arr[j]) {
					max = j;
				}
			}
			swap(arr,max,i);
		}
		
	}
	
	
	public void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	
}
