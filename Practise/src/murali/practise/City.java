package murali.practise;

public enum City {
	
	DELHI{
		public void message(){ 
		System.out.println("welcome user..");
		System.out.println("you are in capital");
		}
		},
		MUMBAI,
		CHENNAI("50 towers"),
		KOLKATA;
		//variables in 
		public String numberofTowers;
		//constructor
		City(){
		this.numberofTowers="100 towers";
		}
		City(String numberofTowers){
			
			this.numberofTowers=numberofTowers;
		}
		public void message(){
		System.out.println("welcome user..");
		}
}
