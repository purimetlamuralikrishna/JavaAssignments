package student.inheritance;

class DayScholar extends Student{
	
	private double transportFee = 1000;
	
	

	DayScholar(int id, String name) {
		super(id, name);
	}
	
	
	@Override
	void displayDetails() {
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Total Fee to Pay: "+(this.examFee+this.transportFee));
	}
	
	
	
	
	@Override
	void payFee(double fee) {
		
		double  totalFee = this.examFee+this.transportFee;
		
		if(fee==totalFee) {
			System.out.println(this.studentName+ " Paid Total Exam Fee");
			this.examFee  = 0;
			this.transportFee = 0;
		}
		else if(fee<totalFee) {
			System.out.println(this.studentName+ " Has Due Amount of Exam Fee: "+(totalFee-fee));
			this.transportFee = totalFee-fee;
		}
		else {
			System.out.println(this.studentName+ " Take Change: "+(fee-totalFee));
		}
	}
	}
