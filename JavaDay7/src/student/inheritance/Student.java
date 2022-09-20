package student.inheritance;

class Student{
	int studentId;
	String studentName;
	double examFee = 2500.0;
	
	Student(int id,String name){
		this.studentId = id;
		this.studentName = name;
	}
	
	void displayDetails() {
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Total Fee to Pay: "+this.examFee);
	}
	void payFee(double fee) {
		if(fee==this.examFee) {
			System.out.println(this.studentName+ " Paid Total Exam Fee");
			this.examFee = 0;
		}
		else if(fee<this.examFee) {
			System.out.println(this.studentName+ " Has Due Amount of Exam Fee: "+(this.examFee-fee));
			this.examFee = this.examFee-fee;
		}
		else {
			System.out.println(this.studentName+ " Take Change: "+(fee-this.examFee));
		}
	}
	
}