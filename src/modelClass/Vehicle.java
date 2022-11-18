package modelClass;

public class Vehicle {
	String vehicleType;
	String brandName;
	String modelName;
	int modelYear;
	int weight;
	int engineCapacity;
	String color;
	
	Vehicle(String vType,String bName,String mName,int mYear,int wt,int engCap,String color){
		this.vehicleType =vType;
		this.brandName = bName;
		this.modelName = mName;
		this.modelYear = mYear;
		this.weight = wt;
		this.engineCapacity = engCap;
		this.color = color;
	}
	
	public void getDetails() {
		System.out.println("Vehicle Type : "+this.vehicleType);
		System.out.println("Brand Name : "+this.brandName);
		System.out.println("Color : "+this.color);
		System.out.println("Model : "+this.modelName+"("+this.modelYear+")");
		System.out.println("Wight(in Kg) : "+this.modelName+"\t Engine Capacity(In KW) : "+this.engineCapacity);
	}
}
