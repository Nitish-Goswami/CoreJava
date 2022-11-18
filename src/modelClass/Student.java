package modelClass;

public class Student {
	
	private final String name;
	private final String rollNo;
	private final String courseName;
	
	Student(String name,String rollNo,String courseName){
		this.name = name;
		this.rollNo = rollNo;
		this.courseName = courseName;
	}
	
	public String getName() {
		return this.name;
	}
	public String getRollNo() {
		return this.rollNo;
	}
	public String getCourseName() {
		return this.courseName;
	}
	

	@Override
	public String toString() {
		return "Name : "+this.name+"\nRoll Number : "+this.rollNo+"\nCourse Name : "+this.courseName+"\n";
	}
	
}
