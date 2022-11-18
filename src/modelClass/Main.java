package modelClass;

public class Main {

	public static void main(String[] args) {
		System.out.println("Student Class");
		Student s1 = new Student("Nitish","20S/CS61","B.Tech");
		System.out.println(s1.toString());
		
		System.out.println("Employee Class");
		Employee e1 = new Employee("Nitish", "IT");
		e1.getDetails();
		
		System.out.println("Car Class");
		Car c1 = new Car("BMW", "Ocean Blue", 25000000);
		c1.getDetails();
		
		System.out.println("Vehicle Class");
		Vehicle v1 = new Vehicle("Four Wheeler", "Mahindra", "Thar", 2019, 1200, 1500, "Red");
		v1.getDetails();
	}

}
