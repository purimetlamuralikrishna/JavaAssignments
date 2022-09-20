package vararg.mobile;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};

	void searchOutdatedModel(String company,String... model) {
		
		for(String m:model) {
			for(String M:outdatedModels) {
				if(m.equals(M)) {
					System.out.println(m+"_OUTDATED");
				}
			}
		}
	}
}
