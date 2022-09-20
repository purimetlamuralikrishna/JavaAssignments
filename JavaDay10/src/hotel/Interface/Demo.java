package hotel.Interface;

import java.util.Scanner;

public class Demo {
	
	
	public Hotel provideFood(int amount) {
		
		if(amount>1000) {
			return new TajHotel();
		}
		else if(amount>=200&&amount<=1000)
			return new RoadSideHotel();
		return null;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Amount");
		int amount = sc.nextInt();
		
		if(amount>=200) {
			Demo d1 = new Demo();
			Hotel hotel = d1.provideFood(amount);
			hotel.chickenBiryani();
			hotel.masalaDosa();
			if (hotel instanceof TajHotel){
				TajHotel tajhotel = (TajHotel) hotel;
				tajhotel.welcomeDrink();
			}
		}
		else {
			System.out.println("Please Enter a valid amount");
		}
		sc.close();
		

	}

}
