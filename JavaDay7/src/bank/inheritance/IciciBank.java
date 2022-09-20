package bank.inheritance;

public class IciciBank extends Bank {
	
	double rateOfIntrest;
		
		
	public double getRateOfIntrest() {
		return rateOfIntrest;
	}
	
	public void setRateOfIntrest(double rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}
	
	public IciciBank(String name,String ifsc) {
		super(name,ifsc);
	}

	
	@Override
	void displayDetails() {
		
		super.displayDetails();
		System.out.println("ICICI Bank Rate Of Intrest are: "+this.rateOfIntrest);
		
	}
	
}
