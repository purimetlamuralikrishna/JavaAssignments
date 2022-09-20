package com.Arrays;


public class ToFindPrime {

	
		public int[] findAndReturnPrimeNumbers(int[] inputArray){
			
			int[] primeArray = new int[inputArray.length];
			int index = -1;
			
			for(int i=0;i<inputArray.length;i++) {
				int num = inputArray[i];
				boolean flag = true;
				
				for(int j=2;j<=num/2&&flag;j++) {
					if(num%j==0) {
						flag = false;
					}
				}
				if(flag) {
					primeArray[++index]=num;
				}
			}
			return primeArray;
			
		}
		
		public void printArray(int primeArray[]) {
			
			for(int i=0;i<primeArray.length;i++) {
				if(primeArray[i]==0) {
					break;
				}
				else {
					System.out.println(primeArray[i]);
				}
			}
			
		}
	
	
		public static void main(String[] args) {
		
			ToFindPrime obj = new ToFindPrime();
			int[] arr = {10,12,5,50,11,14,15};
			
			int[] primeArray = obj.findAndReturnPrimeNumbers(arr);
			
			obj.printArray(primeArray);
			
		}

}
