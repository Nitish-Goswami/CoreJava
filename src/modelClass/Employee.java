package modelClass;

public class Employee {
	private String name;
	private String dept;
	
	Employee(String name, String dept){
		this.name = name;
		this.dept = dept;
	}
	
	public void getDetails() {
		System.out.println("----------------------------"); 
		System.out.println("Name : "+this.name+"\nDepartment : "+this.dept+"\n");
	}
	
}
