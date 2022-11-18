package interfaceDemo;

interface Phone{

	void brandName();
	void OS();
	void display();
}

 class SamsungPhone{
	 void brandName() {
			System.out.println("Welcome to Samsung");
		}
	void OS() {
		System.out.println("OS is : Android");
	}
	
	void display() {
		System.out.println("We have LCD panel display.");
	}
	
	SamsungPhone(){
		this.brandName();
		this.OS();
		this.display();
	}
}

 class NokiaPhone{
	 void brandName() {
			System.out.println("Welcome to Nokia");
		}
	void OS() {
		System.out.println("OS is : Symbian");
	}
	void display() {
		System.out.println("We have Super Amolded  display.");
	}
	NokiaPhone(){
		this.brandName();
		this.OS();
		this.display();
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		SamsungPhone m10 = new SamsungPhone();
		NokiaPhone nokia5 = new NokiaPhone();

	}
}
