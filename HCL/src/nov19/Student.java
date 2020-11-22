package nov19;

public class Student {

	int studentID=550;
	char studentType;
	String studentName;
	
	
	public Student(char studentType, String firstName, String lastName) {
		this.studentID=studentID++;
		this.studentType= studentType;
		this.studentName=firstName+lastName;
	}
	
	public Student() {
		super();
		this.studentID = studentID++;
		this.studentType = 'F';
	}
	
	public static void displayDetails(Student obj) {
		System.out.println(obj.toString());
	}
	
	
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentType=" + studentType + ", studentName=" + studentName
				+ "]";
	}

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
}
