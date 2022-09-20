package student.Abstract;

public class ScienceStudent extends Student {
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	

	public ScienceStudent(String name, String address,int mMarks,int pMarks,int cMarks) {
		super(name, address);
		phisicsMarks = pMarks;
		chemistryMarks = cMarks;
		mathsMarks = mMarks;
	}
	
	

	@Override
	public String toString() {
		return "ScienceStudent [phisicsMarks=" + phisicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", name=" + name + ", address=" + address +"]";
	}



	@Override
	double getPercentage() {
		
		int totalMarks = phisicsMarks+chemistryMarks+mathsMarks;
		double percent =(totalMarks/300.0)*100;
		
		System.out.println(toString());
		return percent;
	}

}
