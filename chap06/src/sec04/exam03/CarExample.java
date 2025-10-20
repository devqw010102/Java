package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("Gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("Gas를 주입하세요.");
		}
	}

}
