package bank.inheritance;

public class Bank {
	
		String branchName;
		String ifscCode;
		
		void displayDetails() {
			System.out.println("This Branch Name is: "+this.branchName);
			System.out.println("This Branch IFSC Code is: "+this.ifscCode);
		}
		
		Bank(String name,String ifsc){
			this.branchName = name;
			this.ifscCode = ifsc;
		}
}
