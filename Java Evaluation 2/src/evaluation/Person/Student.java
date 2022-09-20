package evaluation.Person;

public class Student extends Person {


	 public Student(String name, String gender, String city, String pincode, String state,int id,String course,int fee) {
		super(name, gender, city, pincode, state);
		this.studentId = id;
		this.courseEnrolled = course;
		this.courseFee = fee;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}


	int studentId; 
	 String courseEnrolled;
	 int courseFee;
	 
}