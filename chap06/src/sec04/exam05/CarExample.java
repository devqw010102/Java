package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		
		System.out.println("현재 속도 : " + speed + "km/h");
	}

}
