package com.murali;

public class NumCheck {
	
	
	public static int number(int num) {
		
		if(num <0) {
			return -1; 
		}
		else if(num%2==1) {
			return num;
		}
		else {
			while(true) {
				if(num%10==0) {
					return num;
				}
				num++;
			}
		}
		
	}

	public static void main(String[] args) {
		
		int ans = NumCheck.number(44);
		
		
		if(ans == -1) {
			System.out.println("Error");
		}
		else {
			System.out.println(ans);
		}
		
	}

}
