package student.inheritance;

class Hostler extends Student{
	
	double hostleFee = 5000;
	
	public Hostler(int id, String name) {
		super(id, name);
		
	}
	
	@Override
	void displayDetails() {
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Total Fee to Pay: "+(this.examFee+this.hostleFee));
	}
	
	@Override
	void payFee(double fee) {
		double  totalFee = this.examFee+this.hostleFee;
		
		if(fee==totalFee) {
			System.out.println(this.studentName+ " Paid Total Exam Fee");
			this.examFee = 0;
			this.hostleFee = 0;
		}
		else if(fee<totalFee) {
			System.out.println(this.studentName+ " Has Due Amount of Exam Fee: "+(totalFee-fee));
			this.hostleFee = totalFee-fee;
		}
		else {
			System.out.println(this.studentName+ " Take Change: "+(fee-totalFee));
		}
	}
	
}
