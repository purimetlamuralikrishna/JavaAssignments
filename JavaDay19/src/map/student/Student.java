package map.student;

public class Student {
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}



	int roll;
	String name;
	int marks;
	
	
	
    public Student(int studentRoll,String studentName,int studentMarks) {
		roll = studentRoll;
		name = studentName;
		marks = studentMarks;
	}



	public int getMarks() {
		return marks;
	}


    
    
}
