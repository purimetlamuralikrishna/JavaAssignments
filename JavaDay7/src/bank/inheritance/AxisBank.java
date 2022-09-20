package bank.inheritance;

public class AxisBank extends Bank {
	
	
		double rateOfIntrest;
		
		
		public double getRateOfIntrest() {
			
			return rateOfIntrest;
		}
	
		public void setRateOfIntrest(double rateOfIntrest) {
			
			this.rateOfIntrest = rateOfIntrest;
		}
		
		AxisBank(String name, String ifsc) {
			
			super(name, ifsc);
		}
		

		
		@Override
		void displayDetails() {
		super.displayDetails();
		System.out.println("Axis Bank Rate Of Intrest are: "+this.rateOfIntrest);
		this.getCreditCard();
		}
		
		void getCreditCard() {
			System.out.println("Get the Credit Card from the Axis bank");
		}
		
}
