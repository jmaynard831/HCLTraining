package nov19;

public class CourseManagement {

	public static void main(String args[]) {
		Student s = new Student();
		s.setStudentID(999);
		s.setStudentType('L');
			
		System.out.println(s.getStudentID());
		System.out.println(s.getStudentType());
		
		
		Student stu = new Student();
		System.out.println(stu.getStudentID());
		System.out.println(stu.getStudentType());
		
		Student student1 = new Student('D',"Bony","Thomas");
		Student.displayDetails(student1);
		
		
	}
	
}
