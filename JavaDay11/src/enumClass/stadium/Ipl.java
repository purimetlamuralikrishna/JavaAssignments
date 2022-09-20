package enumClass.stadium;

public class Ipl {

	void homeTeamStadium(Stadium stadium) {
		
		if(stadium == Stadium.EDEN_GARDENS_STADIUM) {
			System.out.println("This is the home ground of KKR");
		}
		else if(stadium == Stadium.WANKHEDE_STADIUM) {
			System.out.println("This is the home ground of Indians”");
		}
		else if(stadium == Stadium.CHIDAMBARAM_STADIUM) {
			System.out.println("This is the home ground of CSK");
		}
		else if(stadium == Stadium.M_CHINNASWAMY_STADIUM) {
			System.out.println("This is the home ground of RCB");
		}
	}
}