package com.RJweek1;



class BubbleSort extends SortingAlgorithm {

	@Override
	void sort(int[] arr, int n) {
		
		 for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                   if(arr[j-1] > arr[j]){  
                        swap(arr,j-1,j);
                             
                     }  
                      
             }  
     }  
	}
	
	public void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
