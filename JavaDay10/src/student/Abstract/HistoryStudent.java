package student.Abstract;

public class HistoryStudent extends Student {
	
	
	
	int historyMarks;
	int civicsMarks;

	public HistoryStudent(String name, String address,int hMarks,int cMarks) {
		super(name, address);
		historyMarks  = hMarks;
		civicsMarks = cMarks;
		
	}
	
	

	@Override
	public String toString() {
		return "HistoryStudent [historyMarks=" + historyMarks + ", civicsMarks=" + civicsMarks + ", name=" + name
				+ ", address=" + address + "]";
	}



	@Override
	double getPercentage() {
		
		int totalMarks = historyMarks+civicsMarks;
		System.out.println(toString());
		return (totalMarks/200.0)*100;
		
	}

}
