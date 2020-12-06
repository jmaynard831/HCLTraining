package dec4;

public class student implements Comparable<student>{

	int id;
	String name;
	String city;
	String subject;
	public student(int id, String name, String city, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", city=" + city + ", subject=" + subject + "]";
	}
	
	
	@Override
	public int compareTo(student o) {
		return this.id-o.id;
	} 
	
	
	
}
