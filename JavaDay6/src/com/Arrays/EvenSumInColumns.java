package com.Arrays;

public class EvenSumInColumns {

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		//int[][] arr = new int[n][m];
		
		int[][] arr  = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=0;j<m;j++) {
				if(arr[i][j]%2 ==0) {
					sum += arr[j][i];
				}
			}
			System.out.println(sum);
		}

	}

}
