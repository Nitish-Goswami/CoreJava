package modelClass;

public class Car {
	private String BrandName ;
	private String color;
	private int price;
	
	Car(String BrandName,String color,int price){
		this.BrandName = BrandName;
		this.color = color;
		this.price = price;
	}
	
	public void getDetails() {
		System.out.println("----------------------------"); 
		System.out.println("Brand Name : "+this.BrandName+"\nColor : "+this.color+"\nPrice : "+this.price+" Rs"+"\n\n");
	}
	
}
