package sec03.example;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car("그랜저", "검정", 300);
		Car car3 = new Car("그랜져", 300, "검정");
		Car car4 = new Car(300, "그랜져", "검정");
		
		Car car5 = new Car("그랜져", "검정");
	}

}
