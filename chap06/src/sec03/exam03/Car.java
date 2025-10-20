package sec03.exam03;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {			// String, String
		this.model = model;
		this.color = color;
	}
	
	Car(String model, int maxSpeed) {			// String, Integer
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
